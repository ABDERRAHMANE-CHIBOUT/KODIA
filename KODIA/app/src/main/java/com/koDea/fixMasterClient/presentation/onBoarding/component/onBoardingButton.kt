package com.koDea.fixMasterClient.presentation.onBoarding.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily

@Composable
fun onBoardingButton(onClick: () -> (Unit), text: String) {
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.White
    ),
        shape = RoundedCornerShape(6.dp)
    ) {
        Text(text = text , fontSize = 14.sp , fontWeight = FontWeight.SemiBold , fontFamily = PoppinsFontFamily)
    }
}
@Composable
fun onBoardingTextButton(
    text: String,
    onClick: () -> Unit,
) {
    TextButton(onClick = onClick) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}