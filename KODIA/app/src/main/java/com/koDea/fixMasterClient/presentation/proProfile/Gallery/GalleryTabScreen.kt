package com.koDea.fixMasterClient.presentation.proProfile.Gallery

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily
import com.koDea.fixMasterClient.util.Response

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GalleryTabScreen(viewModel: GalleryTabScreenViewModel = hiltViewModel()) {

    var showPager by remember {
        mutableStateOf(false)
    }
    var initialPage by rememberSaveable {
        mutableStateOf(0)
    }
    var pagerState = rememberPagerState(initialPage = initialPage) {
        0
    }

    var uriList by rememberSaveable {
        mutableStateOf(listOf<String?>())
    }


    when (val resp = viewModel.images.value) {
        is Response.onLoading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                CircularProgressIndicator()
            }
        }

        is Response.onFaillure -> {}
        is Response.onSuccess -> {

            if (resp.data.isNotEmpty()) {
                pagerState = PagerState {
                    resp.data.size
                }
                uriList = resp.data

                LazyVerticalGrid(columns = GridCells.Fixed(4), modifier = Modifier.fillMaxSize()) {
                    items(resp.data) { item ->
                        AsyncImage(
                            model = item,
                            contentDescription = "image",
                            modifier = Modifier
                                .size(96.dp)
                                .clickable {
                                    showPager = !showPager
                                }
                        )
                    }
                }

            } else {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.no_data),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    )
                    Text(
                        text = "NO Images",
                        Modifier,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = PoppinsFontFamily
                    )
                }

            }
        }
    }

    if (showPager) {
        Box(modifier = Modifier.fillMaxSize()) {
            HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
                AsyncImage(
                    model = uriList[it], contentDescription = "image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            IconButton(onClick = { showPager = !showPager }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBackIosNew,
                    contentDescription = "closeImage"
                )
            }

        }
    }


}