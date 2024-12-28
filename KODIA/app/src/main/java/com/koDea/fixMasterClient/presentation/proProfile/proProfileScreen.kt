package com.koDea.fixMasterClient.presentation.proProfile

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.EaseInBounce
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.EaseOutBounce
import androidx.compose.animation.core.tween
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily
import com.koDea.fixMasterClient.presentation.proProfile.DetailsReviews.DetailsReviewsTabScreen
import com.koDea.fixMasterClient.presentation.proProfile.Gallery.GalleryTabScreen
import com.koDea.fixMasterClient.presentation.proProfile.Profile.ProfileTabScreen
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.navigation.Route

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedContentLambdaTargetStateParameter")
@OptIn(
    ExperimentalMaterial3Api::class, ExperimentalPagerApi::class,
    ExperimentalFoundationApi::class, ExperimentalAnimationApi::class
)
@Composable
fun ProProfileScreen(
    navController: NavHostController,
    viewModel: proProfileViewModel = hiltViewModel()
) {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Profile", "Detailed reviews", "Gallery")
    val pagerState = rememberPagerState(initialPage = 0) {
        titles.size
    }
    var handyMenID by rememberSaveable {
        mutableStateOf("")
    }

    /*LaunchedEffect(key1 = state) {
        pagerState.animateScrollToPage(state)
    }*/
    LaunchedEffect(key1 = pagerState.currentPage) {
        state = pagerState.currentPage
    }
    /*var openConfirmDialog by remember {
        mutableStateOf(false)
    }
    when(openConfirmDialog){
        true -> ConfirmDialog(
            onDismissRequest = { openConfirmDialog = false },
            onConfirmation = { openConfirmDialog = false },
            dialogTitle = "Confirmation",
            dialogText = "do you confirm the hire with you current location ?",
            icon = Icons.Filled.Check
        )
        else -> true
    }*/

    Column(
        modifier = Modifier
            .fillMaxSize()
        //.padding(top = 48.dp)
    ) {
        when (val resp = viewModel.handyMen.value) {
            is Response.onLoading -> {}
            is Response.onFaillure -> {
                Toast.makeText(LocalContext.current, resp.message, Toast.LENGTH_LONG).show()
            }

            is Response.onSuccess -> {
                handyMenID = resp.data.id
                proCard(item = resp.data)
            }
        }
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
                .weight(1f)
        ) {
            var progressState by rememberSaveable {
                mutableStateOf(false)
            }
            if (progressState) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f), contentAlignment = Alignment.Center
                ) {
                    androidx.compose.material3.CircularProgressIndicator(
                        modifier = Modifier.size(
                            64.dp
                        )
                    )
                }
            }
            AnimatedContent(targetState = state, transitionSpec = {
                slideIntoContainer(
                    animationSpec = tween(300, easing = EaseInBounce),
                    towards = AnimatedContentTransitionScope.SlideDirection.Up
                ).with(
                    slideOutOfContainer(
                        animationSpec = tween(300, easing = EaseOutBounce),
                        towards = AnimatedContentTransitionScope.SlideDirection.Down
                    )
                )
            }) {
                when (state) {
                    0 -> ProfileTabScreen()
                    1 -> DetailsReviewsTabScreen()
                    2 -> GalleryTabScreen()
                }

            }
        }
        ExtendedFloatingActionButton(
            onClick = {
                //openConfirmDialog = true
                navController.navigate(Route.RequestScreen.route + "/$handyMenID")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .height(48.dp),
            containerColor = MaterialTheme.colorScheme.primary,
            shape = RoundedCornerShape(32.dp),
            elevation = FloatingActionButtonDefaults.elevation(0.dp)
        ) {
            Text(
                text = stringResource(id = R.string.HireNow),
                fontFamily = PoppinsFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                fontSize = 22.sp
            )

        }
    }

}

@Composable
fun proCard(
    item: HandyMan
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(128.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(0.5f)
                .padding(8.dp), contentAlignment = Alignment.TopStart
        ) {
            AsyncImage(
                model = item.ProfileImage,
                contentDescription = null,
                modifier = Modifier.clip(
                    RoundedCornerShape(8.dp)
                ),
                contentScale = ContentScale.Crop
            )

        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 4.dp, top = 4.dp), contentAlignment = Alignment.TopEnd
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.outlined_save),
                        contentDescription = "save"
                    )

                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 12.dp), verticalArrangement = Arrangement.Center
            ) {
                Card(
                    modifier = Modifier
                        .wrapContentSize()
                        .weight(1f),
                    colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.lightGray))
                ) {
                    Text(
                        text = item.Category,
                        modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
                Text(
                    text = "${item.FirstName} ${item.LastName}",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold
                )
                Row(
                    modifier = Modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.location),
                        contentDescription = "location",
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "${item.City},${item.Wilaya}", textAlign = TextAlign.Center)
                }
                Text(text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.SemiBold
                        )
                    ) {
                        append(text = item.AverageSalary.toString() + "DA")
                    }
                    withStyle(SpanStyle(fontWeight = FontWeight.Light)) {
                        append("/hr")
                    }
                })
            }
        }
    }
}
