package com.koDea.fixMasterClient.presentation.home

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily
import com.koDea.fixMasterClient.domain.model.Category
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.presentation.common.CategoryItem
import com.koDea.fixMasterClient.presentation.common.cardProvider
import com.koDea.fixMasterClient.presentation.common.shimmerEffect
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.navigation.BottomScreenNavigation
import com.koDea.fixMasterClient.util.navigation.Route
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield


@SuppressLint("CoroutineCreationDuringComposition", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class)
@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: HomeViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {
    var Catrgories: MutableList<Category> = remember { mutableListOf() }
    var HandyMan: MutableList<HandyMan> = remember { mutableListOf() }
    var SliderBannerLists: MutableList<HandyMan> = remember {
        mutableListOf()
    }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                //.padding(top = 48.dp)
                .background(
                    color = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.background else colorResource(
                        id = R.color.lightGray
                    )
                )
        ) {


            when (val resp = viewModel.BestSalaryHandyMen.value) {
                is Response.onLoading -> {

                }
                is Response.onFaillure -> {
                    Toast.makeText(context, resp.message, Toast.LENGTH_SHORT)
                        .show()
                }

                is Response.onSuccess -> {
                    if (resp.data != null) {
                        if (!SliderBannerLists.contains(resp.data))
                            SliderBannerLists.add(resp.data)
                    }
                }
            }
            when (val respa = viewModel.BestRatingHandyMen.value) {
                is Response.onLoading -> {}
                is Response.onFaillure -> {
                    Toast.makeText(context, respa.message, Toast.LENGTH_SHORT)
                        .show()
                }

                is Response.onSuccess -> {
                    if (respa.data != null) {
                        if (!SliderBannerLists.contains(respa.data))
                            SliderBannerLists.add(respa.data)
                    }
                }
            }
            item {
                HeaderRow(
                    navController = navController,
                    title = "#SpecialForYou",
                    onClick = {},
                    seeAll = false
                )
                SliderBanner(navController = navController, lists = SliderBannerLists)

            }
            item {
                HeaderRow(navController = navController, title = "Categories", onClick = {
                    navController.navigate(Route.CategoryListScreen.route)
                })

                when (val resp = viewModel.categoryList.value) {
                    is Response.onLoading -> {
                    }

                    is Response.onFaillure -> {
                        Toast.makeText(LocalContext.current, resp.message, Toast.LENGTH_SHORT)
                            .show()
                    }

                    is Response.onSuccess -> {
                        //if (resp.data.isNotEmpty()) title = resp.data[0]?.title ?: ""

                        if (resp.data.isNotEmpty()) Catrgories = resp.data as MutableList<Category>

                        //CategoryRow()
                        if (Catrgories.isNotEmpty()) {

                            Row(modifier = Modifier.fillMaxWidth()) {
                                Catrgories.forEach {
                                    CategoryItem(
                                        navController = navController,
                                        Modifier = Modifier.weight(1f),
                                        title = it.title,
                                        icon = it.icon,
                                        desc = it.description
                                    )
                                }
                            }
                        }


                    }
                }
            }
            item {
                HeaderRow(navController = navController, title = "Best Performers", onClick = {
                    navController.navigate(BottomScreenNavigation.Search.route + "/ / /Rating")
                })
            }
            when (val resp = viewModel.HandyManList.value) {
                is Response.onLoading -> {}
                is Response.onFaillure -> {
                    Toast.makeText(context, resp.message, Toast.LENGTH_SHORT).show()
                }

                is Response.onSuccess -> {
                    if (resp.data.isNotEmpty())
                        HandyMan = resp.data as MutableList<HandyMan>
                    if (HandyMan.isNotEmpty()) {
                        items(HandyMan) { item ->
                            cardProvider(item = item, navController = navController)
                        }
                    }
                }
            }
            /*items(HandyManList) { item ->
                cardProvider(item, navController)
            }*/
        }


}

@ExperimentalPagerApi
@Composable
fun SliderBanner(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    lists: MutableList<HandyMan>
) {
    val pagerState = rememberPagerState(initialPage = 0)
    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(2600)
            if (pagerState.pageCount != 0) {
                pagerState.animateScrollToPage(
                    page = (pagerState.currentPage + 1) % (pagerState.pageCount)
                )
            }

        }
    }

    Column {
        HorizontalPager(
            count = lists.size,
            state = pagerState,
            modifier = modifier
                .wrapContentSize()
                .fillMaxWidth()
        ) { index ->
            cardProvider(item = lists[index], navController = navController)
        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp), activeColor = MaterialTheme.colorScheme.onBackground
        )
    }
}


@Composable
fun HeaderRow(
    navController: NavHostController,
    title: String,
    onClick: (navController: NavHostController) -> Unit,
    seeAll: Boolean = true
) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(48.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(start = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        if (seeAll) {
            Text(
                text = "See all",
                modifier = Modifier
                    .padding(end = 16.dp)
                    .clickable {
                        //navController.navigate(Route.CategoryListScreen.route)
                        onClick(navController)
                    },
                color = MaterialTheme.colorScheme.primary,
                fontSize = 14.sp,
                textAlign = TextAlign.Right,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}

/*data class providerCardData(
    val image: Int,
    val name: String,
    val location: String,
    val service: String,
    val price: String,
    val review: String,
    val nbReview: String,
    val priceType: String
)*/

/*
val lists = listOf(
    HandyMan(FirstName = "Philipp" , LastName = "Lackner" , Category = "Developer" , "blida" , "Blida", Rating = "5.0" , AverageSalary = "650" , ProfileImage = "https://firebasestorage.googleapis.com/v0/b/fixmaster-194a4.appspot.com/o/HandyMan%2FHandyManID%2FProfile%2Fclean_man.jfif?alt=media&token=816299f2-8246-4e3e-82c9-44fd33485398"),
    HandyMan(FirstName = "Philipp" , LastName = "Lackner" , Category = "Developer" , "blida" , "Blida", Rating = "5.0" , AverageSalary = "650" , ProfileImage = "https://firebasestorage.googleapis.com/v0/b/fixmaster-194a4.appspot.com/o/HandyMan%2FHandyManID%2FProfile%2Fclean_man.jfif?alt=media&token=816299f2-8246-4e3e-82c9-44fd33485398"),
    HandyMan(FirstName = "Philipp" , LastName = "Lackner" , Category = "Developer" , "blida" , "Blida", Rating = "5.0" , AverageSalary = "650" , ProfileImage = "https://firebasestorage.googleapis.com/v0/b/fixmaster-194a4.appspot.com/o/HandyMan%2FHandyManID%2FProfile%2Fclean_man.jfif?alt=media&token=816299f2-8246-4e3e-82c9-44fd33485398"),
)*/
