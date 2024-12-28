package com.koDea.fixMasterClient.presentation.booking.Tasks

import Task
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Button
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.StarHalf
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Slider
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.firestore
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.HandyManplusID
import com.koDea.fixMasterClient.presentation.Review.Review
import com.koDea.fixMasterClient.presentation.Review.addReview
import com.koDea.fixMasterClient.util.navigation.Route
import saveTask
import java.math.RoundingMode
import java.sql.Date
import java.text.DecimalFormat


data class BookingT(
    var task :Task,
    var handyman :HandyManplusID
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskCard(navController : NavHostController, item: Task, provider : HandyMan, viewModel: TasksViewModel = hiltViewModel(), context : Context = LocalContext.current){
    val sheetstate = rememberModalBottomSheetState()
    var isSheetOpen by remember {
        mutableStateOf(false)
    }
    var openReviewDialog by remember { mutableStateOf(false) }
    var openReportDialog by remember { mutableStateOf(false) }
    val db = com.google.firebase.Firebase.firestore
    val taskCollection = db.collection("tasks")
    ElevatedCard(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onSecondary),
        modifier = Modifier
            .fillMaxWidth()
            .height(
                if (item.Status == "Done...") {
                    165.dp
                } else {
                    110.dp
                }
            )
            .padding(vertical = 2.dp, horizontal = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable { isSheetOpen = true }
        ,elevation = CardDefaults.cardElevation(2.dp)) {
        Column {
            Row(verticalAlignment = Alignment.Top)
            {
                Box(modifier = Modifier
                    .size(60.dp)
                    .padding(6.dp)) {
                    AsyncImage(
                        model = provider.ProfileImage,
                        contentDescription = "HandyMen Image",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop)
                }
                Column(Modifier.weight(1f)){
                    Text(
                        text = "${provider.FirstName} ${provider.LastName}", color= Color.Black,textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold, fontSize = 13.sp,
                        modifier = Modifier.padding(2.dp)
                    )
                    Text(
                        text = provider.Category,color= Color.Gray, textAlign = TextAlign.Center,fontWeight = FontWeight.Medium,fontSize=12.sp,
                        modifier = Modifier
                            .padding(2.dp)
                        //.clip(RoundedCornerShape(8.dp))
                        //.background(Color.LightGray)
                    )
                }
                Box(
                    Modifier
                        .size(height = 30.dp, width = 100.dp)
                        .padding(6.dp)
                        .wrapContentSize()
                        .align(Alignment.Top) , contentAlignment = Alignment.CenterEnd) {
                    Card(
                        modifier = Modifier
                            .wrapContentSize(align = Alignment.TopEnd, unbounded = true)
                            .clip(RoundedCornerShape(20.dp))
                        ,
                        colors = CardDefaults.cardColors(
                            containerColor = if ((item.Status == "In Progress") || (item.Status == "Done")) {
                                Color(65, 189, 33, 255)
                            } else if ((item.Status == "Rejected") || (item.Status == "Cancelled")) {
                                Color.Red
                            }
                            else if(item.Status =="Done..."){
                                MaterialTheme.colorScheme.primary
                            } else {
                                Color(246, 190, 0)
                            },
                        )
                    ) {
                        Text(

                            text = " ${item.Status} ", color = Color.White, textAlign = TextAlign.Center,
                            fontWeight = FontWeight.SemiBold, fontSize = 12.sp,
                            modifier = Modifier
                                .padding(2.dp)
                        )
                    }
                }
            }

            Row (
                Modifier
                    .weight(0.15f)
                    .padding(10.dp), verticalAlignment = Alignment.Bottom){

                Text(text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.SemiBold
                        )
                    ) {
                        append(text =" ${item.Price}DA")
                    }
                }, Modifier.weight(1f))
                Text(
                    text = item.Time_day, color= Color.Gray,textAlign = TextAlign.Right,fontSize=11.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                )
            }
            if(item.Status =="Done..."){

                Row(
                    Modifier
                        .height(55.dp)
                        .wrapContentSize()
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                        .padding(8.dp), ) {

                    Button(
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .height(40.dp)
                            .weight(1f)
                        ,shape = RoundedCornerShape(12.dp),
                        onClick = {
                            item.Status = "Done"
                            saveTask(
                                taskCollection,
                                HandyId = item.HandyId,
                                clientId = item.clientId,
                                Category = item.Category,
                                Title = item.Title,
                                Description = item.Description,
                                Time_day = item.Time_day,
                                Time_hour = item.Time_hour,
                                Price = item.Price,
                                Wilaya = item.Willaya,
                                Address = item.Address,
                                Status = item.Status,
                                latitude = item.latitude,
                                longitude = item.longitude,
                            )
                            viewModel.deleteTask(item.id)

                            openReviewDialog = true
                            //sendNotification(item.HandyId,"Task Done","your task \"${item.Title}\" is now Done")
                            //addNotification(auth,item.HandyId,"your task \"${item.Title}\" is now Done","Task Done", time = LocalTime.now().toString())
                        }, colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary
                        )
                    )
                    {
                        Text(modifier = Modifier
                            ,text = " Confirm ",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                        )
                    }
                    SmallFloatingActionButton(
                        modifier = Modifier
                            .padding(start = 6.dp)
                            .size(40.dp)
                        ,
                        onClick = {
                            openReportDialog = true

                        }, containerColor =Color.Red, shape = RoundedCornerShape(12.dp)
                    )
                    {
                        Icon(
                            painter = painterResource(R.drawable.report),
                            contentDescription = "report.xml",tint= MaterialTheme.colorScheme.background
                        )
                    }
                }
            }
        }
    }

    var reportDescription by remember { mutableStateOf("") }
    if (openReportDialog) {
       AlertDialog(modifier = Modifier,
           onDismissRequest = { openReportDialog=false },
           confirmButton = {
               Button(onClick = {
                   openReviewDialog = false
                   val report =Report(
                       Reported = item.HandyId,
                       Reporter = item.clientId,
                       Description = reportDescription,
                       TaskId = item.id,
                       ReporterType = "Client",
                       Title = item.Title
                   )
                   addReport(report)
                   openReportDialog =false
                   reportDescription =""
                   },colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary) ) {
                   Text(text = "Report", color = Color.White)
               }
           },
           title = { Text(text = "Report Handyman :", fontSize = 14.sp)},
           text = {
               Column {
                   TextField(
                       value = reportDescription,
                       onValueChange = { reportDescription = it },
                       placeholder ={ Text("Describe your problem", color = Color.Gray) } ,
                       modifier = Modifier.fillMaxWidth()
                   )
               }
           }
       )
    }




    var reviewDescription by remember { mutableStateOf("") }
    var value by remember { mutableStateOf(0F) }
    if (openReviewDialog) {
            AlertDialog(
                onDismissRequest = { openReviewDialog = false },
                title = { Text(text = "Rate your experience:") },
                text = {
                    Column {

                        val random = value
                        val df = DecimalFormat("#.#")
                        df.roundingMode = RoundingMode.DOWN
                        val roundoff = df.format(random)
                        Column( verticalArrangement = Arrangement.Center) {

                            Text((roundoff.toDouble() / 10).toString())
                            Slider(value = value, onValueChange = {
                                value = it
                            },
                                valueRange = 0f..50f,
                                steps = 9,
                                thumb = {

                                },
                                track = {
                                    Row(modifier = Modifier) {
                                        if ((roundoff.toDouble() / 10 ) >= 1.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        }
                                        else if ((roundoff.toDouble() / 10 ) == 0.5)  Icon(imageVector = Icons.AutoMirrored.Filled.StarHalf, contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))

                                        if ((roundoff.toDouble() / 10 ) >= 2.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        }
                                        else if ((roundoff.toDouble() / 10 ) == 1.5)  Icon(imageVector = Icons.AutoMirrored.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))

                                        if ((roundoff.toDouble() / 10 ) >= 3.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        }
                                        else if ((roundoff.toDouble() / 10 ) == 2.5)  Icon(imageVector = Icons.AutoMirrored.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))

                                        if ((roundoff.toDouble() / 10 ) >= 4.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        }
                                        else if ((roundoff.toDouble() / 10 ) == 3.5)  Icon(imageVector = Icons.AutoMirrored.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))

                                        if ((roundoff.toDouble() / 10 ) >= 5.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        }
                                        else if ((roundoff.toDouble() / 10 ) == 4.5)  Icon(imageVector = Icons.AutoMirrored.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = colorResource(id =R.color.star))
                                    }
                                }
                            )
                        }


                        Spacer(modifier = Modifier.height(16.dp))
                        TextField(
                            value = reviewDescription,
                            onValueChange = { reviewDescription = it },
                            placeholder = { Text("Describe your experience",color=Color.Gray) },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                },
                confirmButton = {
                    Button(colors= ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
                        ,onClick = {
                        openReviewDialog = false
                        val user = com.google.firebase.ktx.Firebase.auth.currentUser
                        user?.let {

                            val uid = it.uid
                            val review = Review(value / 10 , reviewDescription, item.HandyId, uid)
                            addReview(review = review)
                        }
                    }) {
                        Text(text = "OK",color =Color.White)
                    }
                }
            )
        }
    if(isSheetOpen) {
        //var jobList =viewModel.getImages(item.request.requestID)
        ModalBottomSheet(
            sheetState = sheetstate,
            onDismissRequest = {
                isSheetOpen=false
            }) {
            if(item.Status=="Rejected"){
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .wrapContentHeight()) {
                Text(
                    text = "Rejection reason : ",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(6.dp)
                )
                Text(
                    text = " ${item.RejectionReason}",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Left,
                    color = Color.Gray,
                    modifier = Modifier.padding(6.dp)
                )
            }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .wrapContentHeight()) {
                Text(
                    text = "Description : ",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(6.dp)
                )
                Text(
                    text = " ${item.Description}",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Left,
                    color = Color.Gray,
                    modifier = Modifier.padding(6.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth() , horizontalArrangement = Arrangement.End , verticalAlignment = Alignment.CenterVertically)
            {

                IconButton(onClick = {
                    if(item.Status !="Cancelled" && item.Status !="Pending") {
                        val uri = Uri.parse("tel:" + provider.PhoneNumber)
                        val intnet = Intent(Intent.ACTION_DIAL, uri)
                        try {
                            context.startActivity(intnet)
                        } catch (e: SecurityException) {
                            Toast.makeText(context, e.localizedMessage, Toast.LENGTH_SHORT).show()
                        }
                    }

                    else{Toast.makeText(context,"feature unavailable for ${item.Status} tasks",Toast.LENGTH_SHORT).show()}
                }) {
                    Icon(
                        painter = painterResource(R.drawable.call),
                        contentDescription = "call"
                    )
                }
                IconButton(onClick = {
                    if(item.Status!="Cancelled" && item.Status !="Pending"){
                        navController.navigate(Route.ChatScreen.route + "/${item.HandyId}")}
                    else{Toast.makeText(context,"feature unavailable for ${item.Status} tasks",Toast.LENGTH_SHORT).show()}
                    }) {
                    Icon(
                        painter = painterResource(R.drawable.chat_icon),
                        contentDescription = "chat"
                    )
                }
                IconButton(onClick = {
                    if(item.Status !="Cancelled" && item.Status !="Pending" ) {
                        openReportDialog=true
                    }
                    else{Toast.makeText(context,"feature unavailable for ${item.Status} tasks",Toast.LENGTH_SHORT).show()}
                }) {
                    Icon(
                        painter = painterResource(R.drawable.report),
                        contentDescription = "report.xml",Modifier
                    )
                }
            }

            Text(text = item.Title, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally))
            /*Box(contentAlignment = Alignment.Center,
                modifier=Modifier.fillMaxWidth()
            ){*/
            ElevatedCard(colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
                elevation = CardDefaults.elevatedCardElevation(16.dp),
                modifier= Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally))
            {
                Row{
                    Text(
                        text = "Provider: ",
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.padding(6.dp,6.dp,6.dp,6.dp)
                    )

                    Text(
                        text = " ${provider.FirstName} ${provider.LastName}",
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.End,
                        color = Color.Gray,
                        modifier = Modifier.padding(6.dp,6.dp,0.dp,6.dp)
                    )
                }
                Row{
                    Column(horizontalAlignment = Alignment.Start, modifier = Modifier) {
                        Text(
                            text = "Status: ",
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Left,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = "Date: ",
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Left,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = "Time: ",
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Left,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = "Phone: ",
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Left,
                            modifier = Modifier.padding(6.dp)
                        )
                    }
                    Column(horizontalAlignment = Alignment.End,modifier= Modifier.weight(1f)) {

                        Text(
                            text = " ${item.Status} ",
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Right,
                            color = Color.Gray,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = item.Time_day,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Right,
                            color = Color.Gray,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = item.Time_hour,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Right,
                            color = Color.Gray,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = if ((item.Status == "Pending") || (item.Status == "Rejected") || (item.Status == "Cancelled")) {
                                "CENSORED"
                            } else {
                                provider.PhoneNumber
                            },
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Right,
                            color = Color.Gray,
                            modifier = Modifier.padding(6.dp)
                        )
                    }
                }
                Text(text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.SemiBold
                        )
                    ) {
                        append(text = "Price : ${item.Price}DA")
                    }
                    /*withStyle(SpanStyle()) {
                        append("/Hr")
                    }

                     */
                },
                    Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally))
                /*text = provider.service, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp).align(Alignment.CenterHorizontally))*/
            }
        }
    }
}



fun addReport(
    report: Report
) {
    val db = com.google.firebase.Firebase.firestore
    val reportCollection = db.collection("Reports")
    val rep = hashMapOf(
        "Reporter" to report.Reporter,
        "Reported" to report.Reported,
        "ReporterType" to report.ReporterType,
        "TaskId" to report.TaskId,
        "Time" to report.Time,
        "Description" to report.Description,
        "Title" to report.Title
    )
    reportCollection.add(rep)
}
data class Report(
    val Reporter: String,
    val Reported: String,
    val Description: String,
    val Title: String,
    val Time: com.google.firebase.Timestamp = com.google.firebase.Timestamp(Date(System.currentTimeMillis())),
    val ReporterType: String,
    val TaskId:String,
)