package com.koDea.fixMasterClient.presentation.CategoryList

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.koDea.fixMasterClient.domain.model.Category
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily

import com.koDea.fixMasterClient.presentation.common.CategoryItem
import com.koDea.fixMasterClient.util.Response


@Composable
fun CategoryListScreen(
    navController: NavHostController,
    catViewModel: CategoryListViewModel = hiltViewModel()
) {

    var lists: MutableList<Category> = remember { mutableListOf() }


    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {

        when (val resp = catViewModel.categoryList.value) {
            is Response.onLoading -> {
            }

            is Response.onFaillure -> {
                Toast.makeText(LocalContext.current, resp.message, Toast.LENGTH_SHORT).show()
            }

            is Response.onSuccess -> {
                //if (resp.data.isNotEmpty()) title = resp.data[0]?.title ?: ""

                if (resp.data.isNotEmpty()) lists = resp.data as MutableList<Category>

                LazyVerticalGrid(
                    columns = GridCells.Fixed(4),
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    modifier = Modifier.padding(top = 8.dp)

                ) {
                    items(lists) { item ->
                        CategoryItem(
                            navController,
                            Modifier,
                            item.title,
                            item.icon,
                            item.description
                        )
                    }
                }

            }
        }


    }


}

data class CategoryItemData(
    val icon: Int,
    val title: String
)



