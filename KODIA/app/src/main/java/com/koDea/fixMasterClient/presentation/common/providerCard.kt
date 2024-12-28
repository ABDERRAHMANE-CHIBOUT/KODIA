package com.koDea.fixMasterClient.presentation.common

import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.useCases.removeSavedHandyMenUseCase
import com.koDea.fixMasterClient.domain.useCases.saveHandyMenUseCase
import com.koDea.fixMasterClient.util.navigation.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardProvider(
    item: HandyMan,
    navController: NavHostController,
    viewModel: CardProviderViewModel = hiltViewModel()
) {

    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    var showBottomSheet by remember { mutableStateOf(false) }
    var saved by rememberSaveable {
        mutableStateOf(item.saved)
    }
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onSecondary),
        modifier = Modifier
            .fillMaxWidth()
            .height(136.dp)
            .padding(vertical = 2.dp, horizontal = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable {
                navController.navigate(Route.ProProfileScreen.route + "/${item.id}")
            },
        elevation = CardDefaults.cardElevation(2.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(8.dp), contentAlignment = Alignment.TopStart
            ) {

                AsyncImage(
                    model = item.ProfileImage,
                    contentDescription = "HandyMen Image",
                    modifier = Modifier.clip(
                        RoundedCornerShape(8.dp)
                    ),
                    contentScale = ContentScale.Crop
                )
                if (item.Rating > 0.0){
                    ElevatedCard(
                        modifier = Modifier.padding(start = 2.dp, top = 2.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Rounded.Star,
                                    contentDescription = null,
                                    modifier = Modifier.size(18.dp),
                                    tint = colorResource(id = R.color.star)
                                )
                                Text(
                                    text = item.Rating.toDouble().toString(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(end = 2.dp),
                                    letterSpacing = -1.sp
                                )
                            }
                        }
                    }

                }
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
                    IconButton(onClick = {
                        if (saved) {
                            //viewModel.removeSavedHandyMen(item.id)
                            //saved = false
                            showBottomSheet = true
                        } else {
                            viewModel.saveHandyMen(item.id)
                            saved = true
                        }
                    }) {

                        androidx.compose.material.Icon(
                            painter = painterResource(id = if (saved) R.drawable.filled_save else R.drawable.outlined_save),
                            contentDescription = "save",
                            tint = MaterialTheme.colorScheme.onBackground
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
                            modifier = Modifier.padding(horizontal = 4.dp),
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
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.location),
                            contentDescription = "location",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(20.dp)
                        )
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
    if (showBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = {
                showBottomSheet = false
            },
            sheetState = sheetState,
            dragHandle = {
                Column(
                    modifier = Modifier
                        .height(48.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Remove from Saved?" , fontWeight = FontWeight.SemiBold)
                    Spacer(modifier = Modifier.height(8.dp))
                    Divider(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp) , color = colorResource(id = R.color.gris) , thickness = 1.dp)
                }
            }, containerColor = MaterialTheme.colorScheme.onSecondary
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(136.dp)
                        .padding(vertical = 2.dp, horizontal = 8.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(Route.ProProfileScreen.route + "/${item.id}")
                        }
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(8.dp), contentAlignment = Alignment.TopStart
                        ) {

                            AsyncImage(
                                model = item.ProfileImage,
                                contentDescription = "HandyMen Image",
                                modifier = Modifier.clip(
                                    RoundedCornerShape(8.dp)
                                ),
                                contentScale = ContentScale.Crop
                            )
                            ElevatedCard(
                                modifier = Modifier.padding(start = 2.dp, top = 2.dp),
                                shape = RoundedCornerShape(8.dp)
                            ) {

                                Box(
                                    modifier = Modifier
                                        .wrapContentSize()
                                        .background(MaterialTheme.colorScheme.background),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            imageVector = Icons.Rounded.Star,
                                            contentDescription = null,
                                            modifier = Modifier.size(18.dp),
                                            tint = colorResource(id = R.color.star)
                                        )
                                        Text(
                                            text = item.Rating.toDouble().toString(),
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.SemiBold,
                                            fontSize = 16.sp,
                                            modifier = Modifier.padding(end = 2.dp),
                                            letterSpacing = -1.sp
                                        )
                                    }
                                }
                            }
                        }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxSize()
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(end = 4.dp, top = 4.dp),
                                contentAlignment = Alignment.TopEnd
                            ) {
                                IconButton(onClick = {
                                    if (saved) {
                                        //viewModel.removeSavedHandyMen(item.id)
                                        //saved = false
                                        showBottomSheet = true
                                    } else {
                                        viewModel.saveHandyMen(item.id)
                                        saved = true
                                    }
                                }) {

                                    androidx.compose.material.Icon(
                                        painter = painterResource(id = if (saved) R.drawable.filled_save else R.drawable.outlined_save),
                                        contentDescription = "save",
                                        tint = MaterialTheme.colorScheme.onBackground
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(vertical = 12.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Card(
                                    modifier = Modifier
                                        .wrapContentSize()
                                        .weight(1f),
                                    colors = CardDefaults.cardColors(
                                        containerColor = colorResource(
                                            id = R.color.lightGray
                                        )
                                    )
                                ) {
                                    Text(
                                        text = item.Category,
                                        modifier = Modifier.padding(horizontal = 4.dp),
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
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.location),
                                        contentDescription = "location",
                                        tint = MaterialTheme.colorScheme.primary,
                                        modifier = Modifier.size(20.dp)
                                    )
                                    Text(
                                        text = "${item.City},${item.Wilaya}",
                                        textAlign = TextAlign.Center
                                    )
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
                Spacer(modifier = Modifier.height(8.dp))

                Row(modifier = Modifier.padding(bottom = 16.dp , start = 8.dp , end = 8.dp)) {
                    androidx.compose.material3.Button(onClick = { showBottomSheet = false }, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                        shape = RoundedCornerShape(8.dp)) {
                        Text(text = "Cancel")
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    androidx.compose.material3.Button(
                        onClick = {
                            viewModel.removeSavedHandyMen(item.id)
                            saved = false
                            showBottomSheet = false
                        }, modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(text = "Yes, Remove")
                    }
                }
            }
        }
    }


}


