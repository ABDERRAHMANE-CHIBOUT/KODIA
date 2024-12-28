package com.koDea.fixMasterClient.presentation.proProfile.Profile

import android.content.Context
import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily
import com.koDea.fixMasterClient.util.Response

@Composable
fun ProfileTabScreen(viewModel: ProfleTabScreenViewModel = hiltViewModel() , context : Context = LocalContext.current) {
    var progressState by remember {
        mutableStateOf(false)
    }
    if (progressState) {
        Box(
            modifier = Modifier
                .fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            androidx.compose.material3.CircularProgressIndicator(modifier = Modifier.size(64.dp))
        }
    }

    var nbRating by rememberSaveable {
        mutableStateOf("")
    }
    when (val resp = viewModel.profileInfo.value) {
        is Response.onLoading -> {
            progressState = true
        }

        is Response.onFaillure -> {
            progressState = false
            Toast.makeText(LocalContext.current, "failled", Toast.LENGTH_SHORT).show()
        }

        is Response.onSuccess -> {
            progressState = false
            val info = resp.data


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.lightGray))
                    .verticalScroll(rememberScrollState())
                    .padding(bottom = 64.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(95.dp)
                        .background(MaterialTheme.colorScheme.background)
                        .padding(horizontal = 8.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(0.3f)
                                .fillMaxHeight(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            when(val respo = viewModel.rating.value){
                                is Response.onLoading -> {}
                                is Response.onFaillure -> {Toast.makeText(context , respo.message , Toast.LENGTH_SHORT).show()}
                                is Response.onSuccess -> {
                                    var ratingHash = respo.data
                                    var rating = ratingHash["Rating"] as Float
                                    nbRating = ratingHash["nbRating"].toString()

                                    val mod = rating % 1
                                    if (mod > 0 && mod < 0.25) rating = rating.toInt().toFloat()
                                    if (mod > 0.25 && mod < 0.75) rating = rating.toInt() + 0.5F
                                    if (mod > 0.75 && mod < 1) rating = rating.toInt() + 1F
                                    var halfStar = if (!rating.isNaN()){ (rating % 1) != 0F} else false
                                    Text(
                                        text = if (rating.isNaN()) 0F.toString() else rating.toString(),
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 36.sp,
                                        fontFamily = PoppinsFontFamily
                                    )
                                    Row(modifier = Modifier) {
                                        for (i in 1..5) {
                                            Icon(
                                                modifier = Modifier.weight(1f),
                                                tint = colorResource(R.color.star),
                                                imageVector = if (i <= rating) {
                                                    Icons.Rounded.Star
                                                } else {
                                                    if (halfStar) {
                                                        halfStar = false
                                                        Icons.Rounded.StarHalf
                                                    } else Icons.Rounded.StarOutline
                                                }, contentDescription = null
                                            )
                                        }
                                    }

                                }
                            }
                        }
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(horizontal = 8.dp)
                        ) {
                            Text(text = buildAnnotatedString {
                                withStyle(
                                    SpanStyle(
                                        fontFamily = PoppinsFontFamily,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                ) {
                                    append(nbRating.toString())
                                }
                                withStyle(SpanStyle(color = Color.Gray)) {
                                    append(" Reviews")
                                }
                            })
                            Text(text = buildAnnotatedString {
                                withStyle(
                                    SpanStyle(
                                        fontFamily = PoppinsFontFamily,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                ) {
                                    append(info.OrdersCompleted)
                                }
                                withStyle(SpanStyle(color = Color.Gray)) {
                                    append(" Orders Completed")
                                }
                            })
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "About Profissional",
                    fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))

                var expanded by remember {
                    mutableStateOf(
                        false
                    )
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
                    .animateContentSize()
                    .clickable { expanded = !expanded }) {
                    Text(
                        text = info.About, maxLines = if (!expanded) 4 else Int.MAX_VALUE,
                        modifier = Modifier.padding(8.dp),
                        fontFamily = PoppinsFontFamily, fontSize = 12.sp,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Services",
                    fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background)
                        .animateContentSize()
                ) {
                   /* var servicesText: String = ""
                    for (i in info.SubCategory.indices) {
                        if (i == info.SubCategory.size - 1) servicesText =
                            "$servicesText-${info.SubCategory[i]}"
                        else servicesText = "$servicesText-${info.SubCategory[i]}\n"
                    }*/
                    Text(
                        text = info.SubCategory, //servicesText,
                        modifier = Modifier.padding(8.dp),
                        fontFamily = PoppinsFontFamily, fontSize = 12.sp,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Working areas",
                    fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background)
                        .animateContentSize()
                ) {
                    /*var workingAreasText: String = ""
                    for (i in info.WorkingAreas.indices) {
                        if (i == info.WorkingAreas.size - 1) workingAreasText =
                            "$workingAreasText-${info.WorkingAreas[i]}"
                        else workingAreasText = "$workingAreasText-${info.WorkingAreas[i]}\n"
                    }*/
                    Text(
                        text = info.WorkingAreas,//workingAreasText,
                        modifier = Modifier.padding(8.dp),
                        fontFamily = PoppinsFontFamily, fontSize = 12.sp,
                        overflow = TextOverflow.Ellipsis
                    )
                }


            }
        }
    }

}

val listOfServices =
    listOf("Eleactrical issues", "Alarm Systems maintenece", "Automatic doors placement")

val textDesc =
    "My name is Josef , been in  buisness for more than 6 years now and ’ll be glad to help you with all your electrical issues ...\n" +
            "Don’t hesitate to hire me, See you soon.My name is Josef , been in  buisness for more than 6 years now and ’ll be glad to help you with all your electrical issues ...\n" +
            "Don’t hesitate to hire me, See you soon."