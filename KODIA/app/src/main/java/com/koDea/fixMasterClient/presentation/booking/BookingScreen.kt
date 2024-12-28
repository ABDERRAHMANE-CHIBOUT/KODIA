package com.koDea.fixMasterClient.presentation.booking

import BookingCard
import Task
//import Taskcard
//import Taskcardcanceld
import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.ui.platform.LocalContext
import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Divider
import androidx.compose.material.TextField
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavHostController
import com.example.handyapp.home.jobs.JobsViewModel
import com.google.firebase.auth.FirebaseAuth
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.presentation.booking.Jobs.Job
import com.koDea.fixMasterClient.presentation.booking.Jobs.JobCard
import com.koDea.fixMasterClient.presentation.booking.Tasks.BookingT
import com.koDea.fixMasterClient.presentation.booking.Tasks.TaskCard
import com.koDea.fixMasterClient.presentation.booking.Tasks.TasksViewModel
import com.koDea.fixMasterClient.presentation.proProfile.DetailsReviews.DetailsReviewsTabScreen
import com.koDea.fixMasterClient.presentation.proProfile.Gallery.GalleryTabScreen
import com.koDea.fixMasterClient.presentation.proProfile.Profile.ProfileTabScreen
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.navigation.Route
//import updateStatus

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun BookingScreen(navController: NavHostController, viewModel: BookingViewModel = hiltViewModel(),tviewmodel: TasksViewModel= hiltViewModel()) {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("States","Jobs")
    val pagerState = rememberPagerState(initialPage = 0) {
        titles.size
    }
    val auth = FirebaseAuth.getInstance().currentUser!!.uid
    Column {
        SecondaryTabRow(selectedTabIndex = state) {
            titles.forEachIndexed { index, title ->
                Tab(selected = state == index, onClick = { state = index },
                    text = { Text(text = title) })
            }
        }
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
            //.weight(1f)
        ) {
            var progressState by rememberSaveable {
                mutableStateOf(false)
            }
            if (progressState) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                    //.weight(1f)
                    , contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(
                            64.dp
                        )
                    )
                }
            }
            when (state) {
                0 ->
                    TasksScreen(navController,viewModel)
                1 ->
                    JobsScreen(JobsViewModel(),navController)//Log.i("1","111")//
            }
        }
    }
}
@Composable
fun JobsScreen(viewModel :JobsViewModel = hiltViewModel(),navController: NavHostController){
    var joblist: MutableList<Job> = remember { mutableListOf() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.background else colorResource(
                    id = R.color.lightGray
                )
            )
    ) {
        when (val resp = viewModel.ClientJobs.value) {
            is Response.onLoading -> {
                Log.i("checkpoint", "loading")
            }

            is Response.onFaillure -> {
                //Toast.makeText(context , resp.message , Toast.LENGTH_SHORT).show()
                Log.i("checkpoint", "failed")
            }

            is Response.onSuccess -> {
                if (resp.data.isNotEmpty())
                    joblist = resp.data as MutableList<Job>
                Log.i("checker0",joblist.toString())
                if (joblist.isNotEmpty()) {
                        items(joblist) { item ->
                            Log.i("jobjob",item.userId)
                            JobCard(job = item , navHostController =navController )
                        }
                } 
            }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasksScreen(navController: NavHostController,viewModel: BookingViewModel = hiltViewModel(),tviewmodel: TasksViewModel = hiltViewModel()) {
    var requestlist: MutableList<Booking> = remember { mutableListOf() }
    var tasklist: MutableList<BookingT> = remember { mutableListOf() }
    val auth = FirebaseAuth.getInstance().currentUser!!.uid
    //tviewmodel.getTaskswithHandyman(auth)
    val statList =
        listOf("All", "Pending", "Cancelled", "In Progress", "Done", "Rejected", "Paused")
    var isExpanded by remember {
        mutableStateOf(false)
    }
    var selectedStatus by remember {
        mutableStateOf(statList[0])
    }
    Column(
        modifier = Modifier.fillMaxSize()
        //.padding(top = 48.dp)
    ) {

        Box(modifier = Modifier.wrapContentSize(), contentAlignment = Alignment.Center) {
            ExposedDropdownMenuBox(
                expanded = isExpanded,
                onExpandedChange = { isExpanded = !isExpanded },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                TextField(
                    value = selectedStatus, onValueChange = {}, readOnly = true,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                    }, modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )
                DropdownMenu(
                    expanded = isExpanded, onDismissRequest = { isExpanded = false },
                    modifier = Modifier
                        .exposedDropdownSize()
                        .padding(2.dp)
                ) {
                    DropdownMenuItem(
                        text = { Text(statList[0]) },
                        onClick = {
                            selectedStatus = statList[0]
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(statList[1]) },
                        onClick = {
                            selectedStatus = statList[1]
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(statList[2]) },
                        onClick = {
                            selectedStatus = statList[2]
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(statList[3]) },
                        onClick = {
                            selectedStatus = statList[3]
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(statList[4]) },
                        onClick = {

                            selectedStatus = statList[4]
                            isExpanded = false

                        }
                    )
                    DropdownMenuItem(
                        text = { Text(statList[5]) },
                        onClick = {
                            selectedStatus = statList[5]
                            isExpanded = false

                        }
                    )
                    DropdownMenuItem(
                        text = { Text(statList[6]) },
                        onClick = {
                            selectedStatus = statList[6]
                            isExpanded = false

                        }
                    )
                }
            }
        }
        LazyColumn(
            modifier = Modifier
                .background(
                    color = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.background else colorResource(
                        id = R.color.lightGray
                    )
                )
        ) {
            var pro = HandyMan()
            when (val resp = viewModel.requests.value) {
                is Response.onLoading -> {
                    Log.i("checkpoint", "loading")
                }

                is Response.onFaillure -> {
                    Log.i("checkpoint", "failed")
                }

                is Response.onSuccess -> {
                    if (resp.data.isNotEmpty())
                        requestlist = resp.data as MutableList<Booking>
                    if (requestlist.isNotEmpty()) {
                        items(requestlist) { item ->
                            if (selectedStatus == "All") {
                                BookingCard(
                                    navController = navController,
                                    item = item.request,
                                    provider = item.handyman
                                )
                            }
                            if (selectedStatus == "Pending") {
                                BookingCard(
                                    navController = navController,
                                    item = item.request,
                                    provider = item.handyman
                                )
                            }
                        }
                    }
                }
            }
            when (val resp = tviewmodel.tasks2.value) {

                is Response.onLoading -> {
                    Log.i("checkpoint", "loading")
                }

                is Response.onFaillure -> {
                    Log.i("checkpoint", "failed")
                }
                is Response.onSuccess -> {
                    if (resp.data.isNotEmpty())
                        tasklist = resp.data as MutableList<BookingT>
                    if (tasklist.isNotEmpty()) {
                        items(tasklist) { item ->
                            if (selectedStatus == "All") {
                                TaskCard(navController = navController, item =item.task , provider =item.handyman.handyMan )
                            }
                             else if(selectedStatus == "Done" && item.task.Status=="Done"|| item.task.Status=="Done..."){
                                TaskCard(navController = navController, item =item.task , provider =item.handyman.handyMan )
                            }
                             else  if (selectedStatus == item.task.Status) {
                                TaskCard(navController = navController, item =item.task , provider =item.handyman.handyMan )
                            }
                        }

                    }
                }
            }

        }
    }
}