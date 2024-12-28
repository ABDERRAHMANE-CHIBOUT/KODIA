package com.koDea.fixMasterClient.presentation.proProfile.DetailsReviews

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.Review
import com.koDea.fixMasterClient.util.Response

@Composable
fun DetailsReviewsTabScreen(viewModel: DetailsReviewsViewModel = hiltViewModel() , context : Context = LocalContext.current) {

    when (val resp = viewModel.reviews.value) {
        is Response.onLoading -> {}
        is Response.onFaillure -> {
            Toast.makeText(context , resp.message?:"error" , Toast.LENGTH_SHORT).show()

        }
        is Response.onSuccess -> {
            if (resp.data.isNotEmpty()) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding()
                ) {
                    items(resp.data) { item ->
                        reviewCard(item = item)
                        Divider(
                            color = Color.LightGray,
                            modifier = Modifier.padding(horizontal = 16.dp)
                        )
                    }
                }
            } else {
                Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally){
                    //Image(painter = painterResource(id = R.drawable.no_data), contentDescription = null, modifier = Modifier.fillMaxSize())
                    Text(text = "NO REVIEWS")
                }
            }
        }
    }


}

@Composable
fun reviewCard(
    item: Review
) {


    Column(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(48.dp),
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier,
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 4.dp)
                    ) {
                        val rating = item.Rating.toDouble()
                        var halfStar = (rating % 1) != 0.0
                        Text(text = "${item.FirstName} ${item.LastName}")
                        Box(modifier = Modifier.width(84.dp)) {
                            Row(modifier = Modifier) {
                                for (i in 1..5) {
                                    Icon(
                                        modifier = Modifier.weight(1f),
                                        tint = MaterialTheme.colorScheme.primary,
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
            }
        }
        Box(modifier = Modifier.padding(start = 8.dp, end = 8.dp, bottom = 8.dp)) {
            Text(
                text = item.Description,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 16.sp
            )
        }
    }


}

val reviewLists = listOf<review>(
    review(
        R.drawable.painterprofile,
        "Soheib Ouzeri",
        "4.5",
        "I had an amazing time at this hair salon; the stylist was highly skilled and kind, and the outcome was precisely what I desired."
    ),
    review(
        R.drawable.painterprofile,
        "Soheib Ouzeri",
        "4.5",
        "I had an amazing time at this hair salon; the stylist was highly skilled and kind, and the outcome was precisely what I desired."
    ),
    review(
        R.drawable.painterprofile,
        "Soheib Ouzeri",
        "4.5",
        "I had an amazing time at this hair salon; the stylist was highly skilled and kind, and the outcome was precisely what I desired."
    ),
    review(
        R.drawable.painterprofile,
        "Soheib Ouzeri",
        "4.5",
        "I had an amazing time at this hair salon; the stylist was highly skilled and kind, and the outcome was precisely what I desired."
    ),
    review(
        R.drawable.painterprofile,
        "Soheib Ouzeri",
        "4.5",
        "I had an amazing time at this hair salon; the stylist was highly skilled and kind, and the outcome was precisely what I desired."
    ),
    review(
        R.drawable.painterprofile,
        "Soheib Ouzeri",
        "4.5",
        "I had an amazing time at this hair salon; the stylist was highly skilled and kind, and the outcome was precisely what I desired."
    ),
)

data class review(val image: Int, val name: String, val review: String, val text: String)