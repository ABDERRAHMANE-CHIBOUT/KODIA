package com.koDea.fixMasterClient.presentation.search

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.common.cardProvider
import com.koDea.fixMasterClient.util.Response

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SearchScreen(
    navController: NavHostController,
    viewModel: SearchViewModel = hiltViewModel(),
    context: Context = LocalContext.current,
    backStackEntryCategory: String?,
    backStackEntrySearchBy: String?,
    backStackEntryOrderBy: String?,

    ) {
    /*Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center){
        Text(text = "Search screen")

    }*/

    var text by rememberSaveable {
        mutableStateOf(if (backStackEntryCategory!!.isBlank()) "" else backStackEntryCategory)
    }
    var active by remember {
        mutableStateOf(false)
    }


    val radioOptionsSearch = listOf("Name", "Category", "Location")
    val (selectedOptionSearch, onOptionSelectedSearch) = remember {
        mutableStateOf(
            if (backStackEntrySearchBy!!.isBlank()) radioOptionsSearch[0]
            else if (backStackEntrySearchBy == "Category") radioOptionsSearch[1]
            else if (backStackEntrySearchBy == "Location") radioOptionsSearch[2]
            else radioOptionsSearch[0]
        )
    }
    val radioOptionsOrder = listOf("Price", "Rating")
    val (selectedOptionOdrer, onOptionSelectedOrder) = remember {
        mutableStateOf(
            if (backStackEntryOrderBy!!.isNotBlank()) radioOptionsOrder[1]
            else radioOptionsOrder[0]
        )
    }


    viewModel.getHandyManList(text, selectedOptionSearch)
    Column(modifier = Modifier) {
        var expanded by remember {
            mutableStateOf(false)
        }
        val keyboardController = LocalSoftwareKeyboardController.current
        androidx.compose.material3.OutlinedTextField(value = text, onValueChange = {
            text = it
            viewModel.getHandyManList(text, selectedOptionSearch)
        }, leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.filled_search),
                contentDescription = "Search",
                modifier = Modifier.size(20.dp)
            )
        },
            trailingIcon = {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        painter = painterResource(id = R.drawable.settings),
                        contentDescription = "Filter"
                    )
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = !expanded }) {
                    Row {
                        Column(
                            Modifier
                                .selectableGroup()
                                .weight(1f)
                        ) {
                            Text(text = "Search :", modifier = Modifier.padding(horizontal = 36.dp))
                            radioOptionsSearch.forEach { text ->
                                Row(
                                    Modifier
                                        .fillMaxWidth()
                                        .height(56.dp)
                                        .selectable(
                                            selected = text == selectedOptionSearch,
                                            onClick = { onOptionSelectedSearch(text) },
                                            role = Role.RadioButton
                                        )
                                        .padding(horizontal = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    androidx.compose.material3.RadioButton(
                                        selected = (text == selectedOptionSearch),
                                        onClick = { onOptionSelectedSearch(text) },
                                    )
                                    Text(
                                        text = "by" + text,
                                        modifier = Modifier.padding(start = 4.dp),
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }
                        }

                        Column(
                            Modifier
                                .selectableGroup()
                                .weight(1f)
                        ) {
                            Text(text = "Order :", modifier = Modifier.padding(horizontal = 36.dp))
                            radioOptionsOrder.forEach { text ->
                                Row(
                                    Modifier
                                        .fillMaxWidth()
                                        .height(56.dp)
                                        .selectable(
                                            selected = text == selectedOptionOdrer,
                                            onClick = { onOptionSelectedOrder(text) },
                                            role = Role.RadioButton
                                        )
                                        .padding(horizontal = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    androidx.compose.material3.RadioButton(
                                        selected = (text == selectedOptionOdrer),
                                        onClick = { onOptionSelectedOrder(text) },
                                    )
                                    Text(
                                        text = "by" + text,
                                        modifier = Modifier.padding(start = 4.dp),
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }
                        }
                    }
                }
            },
            placeholder = { Text(text = "Search by " + selectedOptionSearch) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            shape = AbsoluteRoundedCornerShape(16.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = MaterialTheme.colorScheme.background,
                unfocusedContainerColor = MaterialTheme.colorScheme.background
            )
        )
        /*SearchBar(
            query = text,
            onQueryChange = {
                text = it
                viewModel.getLimitHandyManList(text, selectedOption)
            },
            onSearch = {
                active = !active
                keyboardController?.hide()
            },
            active = false,//active,
            onActiveChange = { active = it },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.filled_search),
                    contentDescription = "Search",
                    modifier = Modifier.size(20.dp)
                )
            },
            shape = AbsoluteRoundedCornerShape(16.dp),
            trailingIcon = {
                if (!active) {
                    IconButton(onClick = { expanded = !expanded }) {
                        Icon(
                            painter = painterResource(id = R.drawable.settings),
                            contentDescription = "Filter"
                        )
                    }
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = !expanded }) {
                        Column(Modifier.selectableGroup()) {
                            radioOptions.forEach { text ->
                                Row(
                                    Modifier
                                        .fillMaxWidth()
                                        .height(56.dp)
                                        .selectable(
                                            selected = text == selectedOption,
                                            onClick = { onOptionSelectedSearch(text) },
                                            role = Role.RadioButton
                                        )
                                        .padding(horizontal = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    androidx.compose.material3.RadioButton(
                                        selected = (text == selectedOption),
                                        onClick = { onOptionSelectedSearch(text) },
                                    )
                                    Text(
                                        text = "by" + text,
                                        modifier = Modifier.padding(start = 4.dp),
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }
                        }
                    }
                } else IconButton(onClick = {
                    if (text.isEmpty()) {
                        active = false
                    } else text = ""
                }) {
                    Icon(imageVector = Icons.Outlined.Close, contentDescription = "close")

                }
            },
            placeholder = { Text(text = "Search by " + selectedOption) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
        ) {}*/
        var error by remember {
            mutableStateOf("")
        }
        var progressState by remember {
            mutableStateOf(false)
        }
        if (progressState) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f), contentAlignment = Alignment.Center
            ) {
                androidx.compose.material3.CircularProgressIndicator(modifier = Modifier.size(64.dp))
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        LazyColumn {
            when (val resp = viewModel.searchList.value) {
                is Response.onLoading -> {
                    progressState = true
                }

                is Response.onFaillure -> {
                    progressState = false
                    Toast.makeText(context, resp.message, Toast.LENGTH_SHORT).show()
                    error = resp.message
                }

                is Response.onSuccess -> {
                    progressState = false

                    items(if (selectedOptionOdrer == "Price")
                        resp.data.sortedBy { it!!.AverageSalary }.filter { it?.Status == "ACTIVE" }
                    else resp.data.sortedByDescending { it!!.Rating.toDouble() }
                        .filter { it?.Status == "ACTIVE" }
                    ) { item ->
                        if (item != null)
                            cardProvider(item = item, navController = navController)
                    }
                }

                else -> {}
            }
        }
    }

}