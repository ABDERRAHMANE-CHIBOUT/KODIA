import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.presentation.booking.BookingViewModel
import com.koDea.fixMasterClient.util.Response
import androidx.compose.runtime.remember as remember

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingCard(navController : NavHostController,item: Request,provider :HandyMan,viewModel: BookingViewModel = hiltViewModel() , context : Context = LocalContext.current){
    viewModel.getImages(item.requestID)
    var sheetstate = rememberModalBottomSheetState()
    var isSheetOpen by remember {
        mutableStateOf(false)
    }

    val status= "Pending"
    ElevatedCard(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onSecondary),
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
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
                    /*
                    val requestId =FirebaseFirestore.getInstance()
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null, alignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )*/
                }
                Column(Modifier.weight(1f)){
                    Text(
                        text = "${provider.FirstName} ${provider.LastName}", color= Color.Black,textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold, fontSize = 14.sp,
                        modifier = Modifier.padding(2.dp)
                    )
                    Text(
                        text = provider.Category,color= Color.Gray, textAlign = TextAlign.Center,fontSize=12.sp, fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(2.dp)
                        //.clip(RoundedCornerShape(8.dp))
                        //.background(Color.LightGray)
                    )
                }
                Box(Modifier.size(height=30.dp,width=100.dp).padding(6.dp).wrapContentSize().align(Alignment.Top)) {
                    Card(
                        modifier = Modifier
                            .wrapContentSize(align = Alignment.TopEnd,unbounded = true)
                            .clip(RoundedCornerShape(20.dp))

                        ,
                        colors = CardDefaults.cardColors(
                            containerColor =
                                Color(246, 190, 0),
                        ),
                    ){
                    Text(
                        text = "  Pending  ", color = Color.White, textAlign = TextAlign.Left,
                        fontWeight = FontWeight.SemiBold, fontSize = 12.sp,
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
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
                        append(text =" ${item.Budget}DA")
                    }
                    withStyle(SpanStyle()) {

                    }
                },Modifier.weight(1f))
                Text(
                    text = item.Day, color= Color.Gray,textAlign = TextAlign.Right,fontSize=11.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .weight(0.4f)
                )
            }
        }
    }
    if(isSheetOpen) {
        //var jobList =viewModel.getImages(item.request.requestID)
        ModalBottomSheet(
            sheetState = sheetstate,
            onDismissRequest = {
                isSheetOpen=false
            }) {
            Box(Modifier.fillMaxWidth()
                .padding(4.dp)
                .height(200.dp)) {
                when (val resp = viewModel.images.value) {
                    is Response.onLoading -> {
                        //Toast.makeText(context , "load" , Toast.LENGTH_SHORT).show()
                    }

                    is Response.onFaillure -> {
                        Toast.makeText(context, "failled", Toast.LENGTH_SHORT).show()
                    }

                    is Response.onSuccess -> {
                        if (resp.data.isNotEmpty()) {
                            
                            LazyHorizontalGrid(
                                rows = GridCells.Fixed(1), modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp)
                                    .height(200.dp)
                            ) {
                                Log.i("checker", item.requestID)
                                // Log.i("cheker",jobList.size.toString())//ID is alright
                                items(resp.data) { //jobImages
                                    Log.i("checker", "success3")
                                    AsyncImage(
                                        model = it,
                                        contentDescription = "Job Image",
                                        modifier = Modifier.height(200.dp),
                                        contentScale = ContentScale.Crop,
                                    )
                                }
                                /*modifier=Modifier.fillMaxWidth().padding(8.dp)
                            */
                            }
                        } else Toast.makeText(context, "vide", Toast.LENGTH_SHORT).show()
                }
            }
        }

            Row(modifier = Modifier.fillMaxWidth() , horizontalArrangement = Arrangement.End , verticalAlignment = Alignment.CenterVertically)
            {

                IconButton(onClick = {
                    Toast.makeText(context,"feature unavailable for pending tasks",Toast.LENGTH_SHORT).show()
                }) {
                    Icon(painter = painterResource(id = R.drawable.call), contentDescription =  null)
                }
                IconButton(onClick = {
                    Toast.makeText(context,"feature unavailable for pending tasks",Toast.LENGTH_SHORT).show()
                    /*navController.navigate(Route.ChatScreen.route + "/${item.HandymanID}")
                     */}){
                    androidx.compose.material3.Icon(
                        painter = painterResource(R.drawable.chat_icon),
                        contentDescription = "chat"
                    )
                }
                IconButton(onClick = {
                    Toast.makeText(context,"feature unavailable for pending tasks",Toast.LENGTH_SHORT).show()
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
                    Column(horizontalAlignment = Alignment.Start, modifier = Modifier.weight(1f)) {
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
                    Column(horizontalAlignment = Alignment.End,modifier=Modifier.weight(1f)) {
                        Text(
                            text = " ${status} ",
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Right,
                            color = Color.Gray,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = item.Day,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Right,
                            color = Color.Gray,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = item.Hour,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Right,
                            color = Color.Gray,
                            modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = "CENSORED",
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
                        append(text = "Price : ${item.Budget}DA")
                    }
                    withStyle(SpanStyle(fontWeight = FontWeight.SemiBold)) {
                        append("/Hr")
                    }
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
}//
//