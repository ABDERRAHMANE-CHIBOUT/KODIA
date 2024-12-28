import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.example.handyapp.home.jobs.JobDetailsViewModel
import com.example.handyapp.home.jobs.JobsViewModel
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.ktx.storage
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.booking.Jobs.Job
import com.koDea.fixMasterClient.presentation.onBoarding.component.PageIndicator
import com.koDea.fixMasterClient.util.Response
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import kotlin.coroutines.coroutineContext

data class Bid(
    val description: String,
    val handymanID: String,
    val price: Int,
    val time: String
)

data class Handyman(
    val firstName: String,
    val lastName: String,
    val profileImageUrl: String
)

@Composable
fun JobDetailsScreen(viewModel: JobDetailsViewModel = hiltViewModel(), navHostController: NavHostController) {
    val jobID: String = viewModel.jobID.value
    val db = Firebase.firestore
    var job by remember { mutableStateOf<Job?>(null) }
    val images = remember { mutableStateListOf<String>() }

    LaunchedEffect(key1 = jobID) {
        val jobDocument = db.collection("Jobs").document(jobID).get().await()
        if (jobDocument.exists()) {
            job = jobDocument.toObject(Job::class.java)
            images.clear()
            val loadedImages = try {
                loadImages(jobID)
            } catch (e: Exception) {
                Log.e("loadImages", "Error loading images: ${e.message}", e)
                emptyList()
            }
            images.addAll(loadedImages)
            Log.d("ImageURLs", "Image URLs: $loadedImages")
        }
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        val scrollState = rememberLazyListState()
        job?.let { job ->
            //JobDetailsPage(job = job, images = images, rootNavController = navHostController, jobID = jobID)
            jobDetails2(
                job = job,
                images = images,
                navController = navHostController,
                jobID = jobID,
                ScrollState =scrollState
            )
        } ?: run {
            Text(text = "Loading job details...")
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun jobDetails2(job: Job,
                images: SnapshotStateList<String>,
                navController: NavHostController,
                jobID: String,

                ScrollState: LazyListState
){
    val pagerState = rememberPagerState(initialPage = 0) {
        images.size
    }
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 16.dp)){


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
            //.padding(16.dp)
            , state = ScrollState
        ) {
            item {


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(196.dp)
                        //.padding(16.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    if (images.isNotEmpty()) {
                        HorizontalPager(state = pagerState,) {
                            Image(
                                painter = if (images.isNotEmpty()) rememberImagePainter(data = images[it])
                                else painterResource(
                                    id = R.drawable.chat_back_dark
                                ),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(196.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                        PageIndicator(
                            modifier = Modifier
                                .width(32.dp)
                                .padding(bottom = 8.dp),
                            selectedPage = pagerState.currentPage,
                            pagesSize = images.take(3).size
                        )
                    } else {
                        Image(
                            painter = painterResource(
                                id = R.drawable.nophotos
                            ),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(400.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                }

                Spacer(modifier = Modifier.height(16.dp))
                Text(text = job.title, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = job.city + ", " + job.wilya,
                        fontSize = 14.sp,
                        maxLines = 1,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = "${job.day}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray,
                        textAlign = TextAlign.End,
                        modifier = Modifier.weight(1f)
                    )

                }

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "${job.min} - ${job.max} DA",
                    style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 22.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Description:", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Text(
                    text = job.description,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )

                Spacer(modifier = Modifier.height(24.dp))
                BidSection(job,jobID = jobID,navController = navController)


            }
        }

    }

}

@Composable
fun JobDetailsPage(job: Job, images: SnapshotStateList<String>, NavController: NavHostController, jobID: String) {
    var selectedImage by remember { mutableStateOf<String?>(null) }

    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(end = 12.dp)
    ) {
        JobDetailsHeader(job = job)

        Spacer(modifier = Modifier.height(16.dp))

        ImageSection(images = images, onImageSelected = { imageUrl ->
            selectedImage = imageUrl
        })
        Spacer(modifier = Modifier.height(16.dp))
        BidSection(job,jobID , navController=NavController)
        selectedImage?.let { imageUrl ->
            AlertDialog(
                onDismissRequest = { selectedImage = null },
                title = { Text(text = "Image Detail") },
                text = { Image(painter = rememberImagePainter(imageUrl), contentDescription = null) },
                confirmButton = {
                    Button(
                        onClick = { selectedImage = null },
                    ) {
                        Text("Close")
                    }
                }
            )
        }
    }
}


@Composable
fun ImageSection(images: List<String>, onImageSelected: (String) -> Unit) {
    Column {
        Text(
            text = "Images",
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp)
        )
        LazyRow(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            items(images) { imageUrl ->
                Image(
                    painter = rememberImagePainter(imageUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .padding(end = 16.dp)
                        .clickable {
                            onImageSelected(imageUrl)
                        },
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Composable
fun BidSection(job :Job,jobID: String,navController: NavHostController) {
    val db = Firebase.firestore
    var bids by remember { mutableStateOf<List<Bid>?>(null) }
    var handymenMap by remember { mutableStateOf<Map<String, Handyman>?>(null) }

    LaunchedEffect(jobID) {
        val bidsSnapshot = db.collection("Jobs").document(jobID).collection("bids").get().await()
        bids = bidsSnapshot.documents.map { document ->
            val description = document.getString("description") ?: ""
            val handymanID = document.getString("handymandID") ?: ""
            val price = document.getLong("price")?.toInt() ?: 0
            val time = document.getString("time") ?: ""
            Bid(description, handymanID, price, time)
        }

        val handymanIds = bids?.map { it.handymanID }?.distinct()
        handymanIds?.let { ids ->
            val handymanDetails = mutableMapOf<String, Handyman>()
            ids.forEach { handymanId ->
                val handymanDocument = db.collection("HandyMan").document(handymanId).get().await()
                val firstName = handymanDocument.getString("FirstName") ?: ""
                val lastName = handymanDocument.getString("LastName") ?: ""
                val profileImageUrl = handymanDocument.getString("ProfileImage") ?: ""
                handymanDetails[handymanId] = Handyman(firstName, lastName, profileImageUrl)
            }
            handymenMap = handymanDetails
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        /*Text(
            text = "Bids",
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp)
        )*/
        Row (modifier = Modifier.fillMaxWidth() , verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "Bids",
                modifier = Modifier
                    .padding(start = 0.dp)
                    .weight(1f),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )

        }
        Spacer(modifier = Modifier.height(8.dp))

        bids?.let { bidList ->
            if (bidList.isNotEmpty()) {
                bidList.forEachIndexed { index, bid ->
                    val handyman = handymenMap?.get(bid.handymanID)
                    handyman?.let {
                        Bid(
                            handymanID = bid.handymanID,
                            handyman = handyman,
                            description = bid.description,
                            time = bid.time,
                            price = bid.price,
                            job =job,
                            jobID =jobID,
                            navHostController = navController
                        )
                        if (index < bidList.size - 1) {
                            Divider()
                        }
                    }
                }
            } else {
                Text(
                    text = "No bids available.",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(16.dp)
                )
            }
        } ?: run {
            Text(
                text = "Loading bids...",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
fun Bid(
    handymanID: String,
    handyman :Handyman,
    description: String,
    time: String,
    price: Int,
    job :Job,
    jobID: String,
    navHostController: NavHostController
) {
    var t = Task(
        id = "",
        Address = job.street,
        Category = job.category,
        Description = job.description,
        Price = price,
        Status = "In Progress",
        Time_day = job.day,
        Time_hour = job.hour,
        Title = job.title,
        Willaya = job.wilya,
        clientId = job.userId,
        longitude = 0.0,
        latitude = 0.0,
        HandyId = ""
    )
    /*

     */
    var dialogopen = remember{ mutableStateOf(false) }
    var con :Context = LocalContext.current
    if(dialogopen.value) {
        AlertDialog(
            onDismissRequest = { dialogopen.value = false },
            title = { Text(text = "Bid Details") },
            text = {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        AsyncImage(
                            model = handyman.profileImageUrl,
                            contentDescription = "Handyman Image",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(RoundedCornerShape(percent = 50))
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = "${handyman.firstName} ${handyman.lastName}",
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.primary
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = description,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row {
                        Text(
                            text = "Time: $time",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Price: $price DA",
                            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                            color = MaterialTheme.colorScheme.primary
                        )
                    }

                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        val db = com.google.firebase.Firebase.firestore
                        val taskCollection = db.collection("tasks")
                        saveTask(
                            taskCollection,
                            HandyId  = handymanID,
                            clientId = t.clientId,
                            Category = t.Category,
                            Title = t.Title,
                            Description = description,
                            Time_day = t.Time_day,
                            Time_hour = t.Time_hour,
                            Price = price,
                            Wilaya = t.Willaya,
                            Address = t.Address ,
                            Status = t.Status,
                            latitude = 0.0 ,
                            longitude = 0.0 ,
                        )
                        dialogopen.value = false
                        navHostController.navigateUp()
                        Toast.makeText(con, "Bid chosen successfully ", Toast.LENGTH_SHORT).show()
                        db.collection("Jobs").document(jobID).delete()

                    },
                ) {
                    Text("Confirm bid")
                }
            }, dismissButton = {
                Button(onClick = {
                    dialogopen.value = false
                }) {
                    Text("Back")
                }
            }
        )
    }
    var expanded by remember { mutableStateOf(false) }


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ), onClick = {
            dialogopen.value=true
        }
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    model = handyman.profileImageUrl,
                    contentDescription = "Handyman Image",
                    modifier = Modifier
                        .size(64.dp)
                        .clip(RoundedCornerShape(percent = 50))
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "${handyman.firstName} ${handyman.lastName}",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = description,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .animateContentSize()
                            .clickable { expanded = !expanded },
                        maxLines = if (expanded) Int.MAX_VALUE else 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(
                    text = "Time: $time",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Price: $price DA",
                    style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}



private suspend fun loadImages(jobID: String): List<String> = withContext(Dispatchers.IO) {
    val storageRef = Firebase.storage.reference.child("Job/$jobID")
    val jobFolderRef = storageRef

    val images = mutableListOf<String>()
    try {
        val result = jobFolderRef.listAll().await()

        for (itemRef in result.items) {
            if (itemRef.path.endsWith(".jpg") || itemRef.path.endsWith(".png") || itemRef.path.endsWith(".jpeg")) {
                val imageUrl = itemRef.downloadUrl.await().toString()
                images.add(imageUrl)
            }
        }
    } catch (e: Exception) {
        Log.e("loadImages", "Error loading images: ${e.message}", e)
    }
    return@withContext images
}
@Composable
fun JobDetailsHeader(job: Job) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 32.dp)
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
    ) {
        Text(
            text = job.title,
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Category: ${job.category}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )

            Text(
                text = "Status: ${job.status}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Description:",
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.onSurface
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = job.description,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            maxLines = 5,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Location: ${job.street}, ${job.city}, ${job.wilya}",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Date: ${job.day} ${job.hour}",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Budget:",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )

            Text(
                text = "${job.min}DA - ${job.max}DA",
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

fun addTask(task :Task){
    val db = FirebaseFirestore.getInstance()
    val storage = FirebaseStorage.getInstance().reference

    val collectionRef = db.collection("tasks")
    val documentRef = collectionRef.add(task)
        .addOnSuccessListener { documentReference ->
            val documentId = documentReference.id
            val ref = storage
            Log.i("taskcheck",documentId)
        }
        .addOnFailureListener { e ->
            println("Error adding document: $e")

        }
}
fun saveTask(
    taskCollectionRef: CollectionReference,
    HandyId: String,
    clientId: String,
    Category: String,
    Title: String,
    Description: String,
    Time_day: String,
    Time_hour: String,
    Price: Int,
    Wilaya: String,
    Address: String,
    Status: String,
    latitude: Double, // Change Int to Double for latitude
    longitude: Double, // Change Int to Double for longitude
) {
    val task = hashMapOf(
        "HandyId" to HandyId,
        "clientId" to clientId,
        "Category" to Category,
        "Title" to Title,
        "Description" to Description,
        "Time_day" to Time_day,
        "Time_hour" to Time_hour,
        "Price" to Price,
        "Wilaya" to Wilaya,
        "Address" to Address,
        "Status" to Status,
        "latitude" to latitude,
        "longitude" to longitude
    )

    taskCollectionRef.add(task)
}