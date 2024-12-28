package com.koDea.fixMasterClient.presentation.onBoarding

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun onBoardingPage(modifier : Modifier = Modifier,page: Page) {
    Column(modifier = modifier , horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = page.image),
            contentDescription = page.title,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .padding(horizontal = 16.dp),
            contentScale = ContentScale.Fit,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary , BlendMode.Softlight),
        )
        Text(
            text = page.title,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 40.sp,
            modifier = Modifier.padding(start = 24.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = page.description,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            textAlign = TextAlign.Center
        )

    }
}

@Preview(showSystemUi = true , uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun tst() {
    onBoardingPage(page = pages[0])
}
