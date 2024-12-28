package com.koDea.fixMasterClient.presentation.settings.profile

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.common.cardProvider
import com.koDea.fixMasterClient.presentation.settings.savedHandyMan.SavedHandyManViewModel
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.navigation.Route

@Composable
fun SavedHandyManScreen(browseNavController : NavHostController,viewModel : SavedHandyManViewModel = hiltViewModel()){

    when(val resp = viewModel.savedHandyManList.value){
        is Response.onLoading -> {
            Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center){
                CircularProgressIndicator()
            }
        }
        is Response.onFaillure -> {
            Column(modifier = Modifier.fillMaxSize() , verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(R.drawable.error_illust), contentDescription = resp.message)

            }

        }
        is Response.onSuccess -> {
            if (resp.data.isNotEmpty()){
                LazyColumn (Modifier.fillMaxSize()){
                    items(resp.data){
                        cardProvider(item = it, navController = browseNavController)
                    }
                }

            }else{
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
                        text = "You didn't save any handymen",
                        Modifier.padding(bottom = 24.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = PoppinsFontFamily
                    )
                }
            }

        }
    }
}