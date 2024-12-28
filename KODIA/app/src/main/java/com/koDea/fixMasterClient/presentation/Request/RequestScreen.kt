package com.koDea.fixMasterClient.presentation.Request

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.Notification
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.domain.model.wilayas_communes.Baladyiat
import com.koDea.fixMasterClient.presentation.postTask.sendNotification
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.Wilaya_CommunesDBList
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapInitOptions
import com.mapbox.maps.Style
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.animation.viewport.rememberMapViewportState
import com.mapbox.maps.extension.compose.annotation.generated.PointAnnotation
import com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroup
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings
import com.mapbox.maps.plugin.compass.generated.CompassSettings
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarConfig
import com.maxkeppeler.sheets.calendar.models.CalendarSelection
import com.maxkeppeler.sheets.clock.ClockDialog
import com.maxkeppeler.sheets.clock.models.ClockSelection
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


@OptIn(ExperimentalMaterial3Api::class, ExperimentalPermissionsApi::class)
@SuppressLint(
    "UnusedMaterial3ScaffoldPaddingParameter", "MissingPermission",
    "CoroutineCreationDuringComposition"
)

@Composable
fun RequestScreen(
    navController: NavHostController,
    viewModel: RequestViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {


    var wilaya = rememberSaveable { mutableStateOf("") }
    var city = rememberSaveable { mutableStateOf("") }
    var street = rememberSaveable { mutableStateOf("") }


    var selectedImageUris by remember {
        mutableStateOf<List<Uri>>(emptyList())
    }
    val multiplePhotoPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickMultipleVisualMedia(),
        onResult = { uris -> selectedImageUris = uris })

    var day = rememberSaveable { mutableStateOf("") }
    var hour = rememberSaveable { mutableStateOf("") }

    val calendarState = rememberSheetState()
    CalendarDialog(state = calendarState,
        config = CalendarConfig(
            monthSelection = true,
            yearSelection = true,
        ),
        selection = CalendarSelection.Date { date ->
            day.value = date.toString()
        })

    val clockState = rememberSheetState()
    ClockDialog(state = clockState,
        selection = ClockSelection.HoursMinutes { hours, minutes ->
            hour.value = hours.toString() + ":" + minutes.toString()


        })


    var HandymanName by remember {
        mutableStateOf(" Amine Benali")
    }
    var HandymanProfession by remember {
        mutableStateOf(" Plumber")
    }
    var Title = rememberSaveable { mutableStateOf("") }
    var Description = rememberSaveable { mutableStateOf("") }


    var budget = rememberSaveable { mutableStateOf("") }

    var TitleError = rememberSaveable { mutableStateOf(false) }
    var DescriptionError = rememberSaveable { mutableStateOf(false) }
    var wilayaError by rememberSaveable { mutableStateOf(false) }
    var cityError by rememberSaveable { mutableStateOf(false) }
    var StreetError by rememberSaveable { mutableStateOf(false) }
    var dayError by rememberSaveable { mutableStateOf(false) }
    var hourError by rememberSaveable { mutableStateOf(false) }
    var budgetError = rememberSaveable { mutableStateOf(false) }


    var TitleSupportingText = rememberSaveable {
        mutableStateOf("")
    }
    var StreetSupportingText = rememberSaveable {
        mutableStateOf("")
    }
    var DescriptionSupportingText = rememberSaveable {
        mutableStateOf("")
    }
    var WilayaSupportingText = rememberSaveable {
        mutableStateOf("")
    }
    var CitySupportingText = rememberSaveable {
        mutableStateOf("")
    }
    var DaySupportingText = rememberSaveable {
        mutableStateOf("")
    }
    var HourSupportingText = rememberSaveable {
        mutableStateOf("")
    }
    var BudgetSupportingText = rememberSaveable {
        mutableStateOf("")
    }


    var handyMenID by rememberSaveable {
        mutableStateOf("")
    }
    var handyMenDeviceToken by rememberSaveable {
        mutableStateOf("")
    }
    var showMap by remember {
        mutableStateOf(false)
    }
    val mapViewportState = rememberMapViewportState {
        setCameraOptions {
            center(Point.fromLngLat(2.8770072419209303, 36.50321008456727))
            zoom(3.0)
            pitch(0.0)
        }
    }

    val mapBoxUiSettings: GesturesSettings by remember {
        mutableStateOf(GesturesSettings {
            rotateEnabled = true
            pinchToZoomEnabled = true
            pitchEnabled = true
        })
    }

    val compassSettings: CompassSettings by remember {
        mutableStateOf(CompassSettings { enabled = false })
    }

    val scaleBarSetting: ScaleBarSettings by remember {
        mutableStateOf(ScaleBarSettings { enabled = false })
    }
    var locationRequired: Boolean = false
    var locationInfo: Location? = null
    val locationClient =
        remember { LocationServices.getFusedLocationProviderClient(context) }
    val scope = rememberCoroutineScope()
    val launcherMultiplePermissions =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.RequestMultiplePermissions()) { permissionMaps ->
            val areGaranted = permissionMaps.values.reduce { acc, b -> acc && b }
            if (areGaranted) {
                locationRequired = true
                Toast.makeText(context, "permission garanted", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(context, "permission deneid", Toast.LENGTH_LONG).show()
            }
        }
    var point by rememberSaveable {
        mutableStateOf<Point?>(null)
    }
    var currentLoc by rememberSaveable {
        mutableStateOf<Point?>(null)
    }
    val permissions = arrayOf(
        android.Manifest.permission.ACCESS_FINE_LOCATION,
        android.Manifest.permission.ACCESS_COARSE_LOCATION
    )
    var showLocationField by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                //.padding(top = 64.dp)
                .verticalScroll(rememberScrollState())
                .background(
                    color = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.background else colorResource(
                        id = R.color.lightGray
                    )
                )
        ) {
            when (val resp = viewModel.handyMen.value) {
                is Response.onLoading -> {}
                is Response.onFaillure -> {}
                is Response.onSuccess -> {
                    handyMenID = resp.data.id
                    handyMenDeviceToken = resp.data.DeviceToken
                    proCard(
                        item = resp.data
                    )
                }
            }


            //request form

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,


                ) {

                /*Text(
                    text = "Request",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(10.dp))*/

                com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                    value = Title,

                    label = "Title",

                    placeHolder = "Title for your request",
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Edit, contentDescription = null
                        )
                    },
                    trailingIcon = {},
                    supportingText = TitleSupportingText,
                    isError = TitleError
                )
                Spacer(modifier = Modifier.height(8.dp))

                com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                    value = Description,

                    label = "Description",
                    placeHolder = "Description of your request",

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Edit, contentDescription = null
                        )
                    },
                    trailingIcon = {},
                    supportingText = DescriptionSupportingText,
                    maxLines = Int.MAX_VALUE,
                    singleLine = false,
                    isError = DescriptionError
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Photo :",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp)

                )
                Spacer(modifier = Modifier.height(8.dp))


                //*******************************//

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                    //.padding(horizontal = 16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = {
                                multiplePhotoPickerLauncher.launch(
                                    PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(text = "Upload")
                        }
                    }
                    selectedImageUris.forEach { uri ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AsyncImage(
                                model = uri,
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                }
                //*************************************************//
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Location :",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp),


                    )
                Button(onClick = { showMap = !showMap }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(8.dp)) {
                    Text("Select on Map")
                }
                Spacer(modifier = Modifier.height(8.dp))

                /*com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                    value = wilya,

                    label = "Wilaya",
                    placeHolder = "Enter your current wilya",
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.location),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {},
                    supportingText = WilayaSupportingText
                )*/
                var isExpandedWilaya by remember {
                    mutableStateOf(false)
                }
                var selectedStatusWilaya by remember {
                    mutableStateOf("")
                }
                var selectedStatusCity by remember {
                    mutableStateOf("")
                }


                AnimatedVisibility(visible = showLocationField) {
                    Column {


                        Box(
                            modifier = Modifier.wrapContentSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            ExposedDropdownMenuBox(
                                expanded = isExpandedWilaya,
                                onExpandedChange = { isExpandedWilaya = !isExpandedWilaya },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp)
                            ) {
                                OutlinedTextField(
                                    value = selectedStatusWilaya, onValueChange = {
                                        wilayaError = false
                                        WilayaSupportingText.value = ""
                                    }, readOnly = true,
                                    trailingIcon = {
                                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpandedWilaya)
                                    }, modifier = Modifier
                                        .menuAnchor()
                                        .fillMaxWidth(),
                                    leadingIcon = {
                                        Icon(

                                            painter = painterResource(id = R.drawable.location),
                                            contentDescription = null
                                        )
                                    },
                                    placeholder = {
                                        Text(text = "select wilya")
                                    },
                                    shape = RoundedCornerShape(8.dp),
                                    supportingText = {
                                        Text(
                                            text = "${WilayaSupportingText.value}",
                                            color = MaterialTheme.colorScheme.error
                                        )
                                    }
                                )
                                DropdownMenu(
                                    expanded = isExpandedWilaya,
                                    onDismissRequest = { isExpandedWilaya = false },
                                    modifier = Modifier
                                        .exposedDropdownSize()
                                        .padding(2.dp)
                                ) {
                                    Wilaya_CommunesDBList.sortedBy { it.name_en }.forEach {
                                        DropdownMenuItem(
                                            text = { Text(it.name_en.lowercase()) },
                                            onClick = {
                                                selectedStatusWilaya = it.name_en
                                                wilaya.value = selectedStatusWilaya
                                                isExpandedWilaya = false
                                                wilayaError = false
                                                WilayaSupportingText.value = ""
                                                selectedStatusCity = ""
                                            }
                                        )
                                    }

                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        var isExpandedCity by remember {
                            mutableStateOf(false)
                        }
                        Box(
                            modifier = Modifier.wrapContentSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            ExposedDropdownMenuBox(
                                expanded = isExpandedCity,
                                onExpandedChange = { isExpandedCity = !isExpandedCity },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp)
                            ) {
                                androidx.compose.material3.OutlinedTextField(
                                    value = selectedStatusCity, onValueChange = {
                                        cityError = false
                                        CitySupportingText.value = ""
                                    }, readOnly = true,
                                    trailingIcon = {
                                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpandedCity)
                                    }, modifier = Modifier
                                        .menuAnchor()
                                        .fillMaxWidth(),
                                    leadingIcon = {
                                        Icon(

                                            painter = painterResource(id = R.drawable.location),
                                            contentDescription = null
                                        )
                                    },
                                    placeholder = {
                                        Text(text = "select city")
                                    },
                                    shape = RoundedCornerShape(8.dp),
                                    supportingText = {
                                        Text(
                                            text = "${CitySupportingText.value}",
                                            color = MaterialTheme.colorScheme.error
                                        )
                                    }
                                )
                                DropdownMenu(
                                    expanded = isExpandedCity,
                                    onDismissRequest = { isExpandedCity = false },
                                    modifier = Modifier
                                        .exposedDropdownSize()
                                        .padding(2.dp)
                                ) {
                                    val wilayaSelected =
                                        Wilaya_CommunesDBList.find { it.name_en == selectedStatusWilaya }
                                    val allBaladyiat = mutableListOf<Baladyiat>()
                                    wilayaSelected?.dairats?.forEach {
                                        if (it.baladyiats != null)
                                            allBaladyiat.addAll(it.baladyiats)
                                    }
                                    allBaladyiat.sortedBy { it.name_en }.forEach {
                                        DropdownMenuItem(
                                            text = { Text(it.name_en.lowercase()) },
                                            onClick = {
                                                selectedStatusCity = it.name_en.lowercase()
                                                city.value = selectedStatusCity
                                                isExpandedCity = false
                                                cityError = false
                                                CitySupportingText.value = ""
                                            }
                                        )
                                    }

                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))

                        com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                            value = street,
                            label = "Adresse",
                            placeHolder = "Enter your current Adresse",
                            leadingIcon = {
                                Icon(

                                    painter = painterResource(id = R.drawable.location),
                                    contentDescription = null
                                )
                            },
                            trailingIcon = {},
                            supportingText = StreetSupportingText
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                }


                /*com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                    value = city,

                    label = "City",

                    placeHolder = "Enter your current city",
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.location),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {},
                    supportingText = CitySupportingText

                )*/

                when (val resp = viewModel.location.value) {
                    is Response.onLoading -> {}
                    is Response.onFaillure -> {
                        Toast.makeText(context, resp.message, Toast.LENGTH_SHORT).show()
                    }

                    is Response.onSuccess -> {

                        if (resp.data != null) {
                            //Toast.makeText(context , resp.data.address.state , Toast.LENGTH_SHORT).show()
                            street.value = resp.data.display_name.toString().lowercase()
                            selectedStatusWilaya = resp.data.address?.state.toString().lowercase()
                            selectedStatusCity = resp.data.address?.town.toString().lowercase()
                        } else Toast.makeText(context, "false", Toast.LENGTH_SHORT).show()
                    }
                }



                Text(
                    text = "Timing :",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp)

                )
                com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                    value = day,

                    label = "Day",
                    placeHolder = "day",

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.DateRange, contentDescription = null
                        )
                    },
                    trailingIcon = {},
                    supportingText = DaySupportingText,
                    readOnly = true,
                    modifier = Modifier.clickable {
                        calendarState.show()
                        DaySupportingText.value = ""
                        dayError = false
                    },
                    enabled = false
                )
                //Spacer(modifier = Modifier.height(8.dp))


                com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                    value = hour,

                    label = "Hour",
                    placeHolder = "hour",

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.DateRange, contentDescription = null
                        )
                    },
                    trailingIcon = {},
                    supportingText = HourSupportingText,
                    readOnly = true,
                    modifier = Modifier.clickable {
                        clockState.show()
                        HourSupportingText.value = ""
                        hourError = false
                    },
                    enabled = false
                )

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Budget :",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp)

                )
                com.koDea.fixMasterClient.presentation.common.OutlinedTextField(
                    value = budget,

                    label = "Budget",
                    placeHolder = "Budget",

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.AttachMoney, contentDescription = null
                        )
                    },
                    trailingIcon = {},
                    supportingText = BudgetSupportingText,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = budgetError
                )

                Spacer(modifier = Modifier.height(12.dp))
                var progressState by rememberSaveable { mutableStateOf(false) }
                Button(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp), shape = RoundedCornerShape(8.dp), onClick = {
                    progressState = true

                    TitleError.value = false
                    DescriptionError.value = false
                    wilayaError = false
                    cityError = false
                    StreetError = false
                    dayError = false
                    hourError = false
                    budgetError.value = false

                    if (Title.value.isEmpty() || Description.value.isEmpty() || selectedStatusWilaya.isEmpty() ||
                        selectedStatusCity.isEmpty() || street.value.isEmpty() || day.value.isEmpty() || hour.value.isEmpty() ||
                        budget.value.isEmpty()
                    ) {
                        progressState = false

                        if (Title.value.isEmpty()) {
                            TitleError.value = true
                            TitleSupportingText.value = "Title can't be empty"

                        }
                        if (Description.value.isEmpty()) {
                            DescriptionError.value = true
                            DescriptionSupportingText.value = "Description can't be empty"
                        }
                        if (selectedStatusWilaya.isEmpty()) {
                            wilayaError = true
                            WilayaSupportingText.value = "Wilaya can't be empty"
                        }
                        if (selectedStatusCity.isEmpty()) {
                            cityError = true
                            CitySupportingText.value = "City can't be empty"
                        }
                        if (street.value.isEmpty()) {
                            StreetError = true
                            StreetSupportingText.value = "Adresse can't be empty"
                        }
                        if (day.value.isEmpty()) {
                            dayError = true
                            DaySupportingText.value = "Day can't be empty"
                        }
                        if (hour.value.isEmpty()) {
                            hourError = true
                            HourSupportingText.value = "Hour can't be empty"
                        }
                        if (budget.value.isEmpty()) {
                            budgetError.value = true
                            BudgetSupportingText.value = "Budget can't be empty"
                        }
                    } else {
                        val user = Firebase.auth.currentUser
                        user?.let {

                            val uid = it.uid

                            val request = Request(
                                uid,
                                handyMenID,
                                Title.value,
                                Description.value,
                                selectedStatusWilaya,
                                selectedStatusCity,
                                street.value,
                                day.value,
                                hour.value,
                                budget.value.toInt(),
                                point?.latitude() ?: 0.0,
                                point?.longitude() ?: 0.0
                            )
                            /*addRequestToFirestore(request, selectedImageUris, handyMenDeviceToken)
                            navController.navigateUp()*/
                            viewModel.addRequest(
                                request,
                                selectedImageUris,
                                handyMenDeviceToken
                            )


                        }
                    }

                }) {

                    when (val resp = viewModel.addRequestState.value) {
                        is Response.onLoading -> {
                        }

                        is Response.onFaillure -> {
                            progressState = false
                            Toast.makeText(context, resp.message, Toast.LENGTH_SHORT).show()
                        }

                        is Response.onSuccess -> {
                            LaunchedEffect(true) {


                                progressState = false
                                Toast.makeText(
                                    context,
                                    "request Successful",
                                    Toast.LENGTH_SHORT
                                ).show()
                                sendNotification(
                                    playerId = handyMenDeviceToken,
                                    title = "New request",
                                    message = "You have new request."
                                )
                                viewModel.sendNotificationFireStore(
                                    Notification(
                                        title = "New Request",
                                        text = "You have new request",
                                        receiver = handyMenID,
                                        deepLink = "request"
                                    )
                                )
                                navController.navigateUp()
                            }


                        }
                    }



                    Row {
                        Text(text = "Confirm")
                        if (progressState) {
                            CircularProgressIndicator(
                                color = Color.White,
                                modifier = Modifier
                                    .size(26.dp)
                                    .fillMaxSize(),
                                strokeWidth = 2.5.dp
                            )
                        }
                    }


                    /*when (val resp = viewModel.addRequestState.value) {
                        is Response.onLoading -> {
                            *//*CircularProgressIndicator(
                                        color = Color.White,
                                        modifier = Modifier
                                            .size(26.dp)
                                            .fillMaxSize(),
                                        strokeWidth = 2.5.dp
                                    )*//*
                                    Toast.makeText(context, "load", Toast.LENGTH_SHORT).show()

                                }

                                is Response.onFaillure -> {
                                    progressState = false
                                    Toast.makeText(context, resp.message, Toast.LENGTH_SHORT).show()
                                }

                                is Response.onSuccess -> {
                                    Toast.makeText(
                                        context,
                                        "request Successful",
                                        Toast.LENGTH_SHORT
                                    ).show()


                                    progressState = false

                                    sendNotification(
                                        playerId = handyMenDeviceToken,
                                        title = "New request",
                                        message = "You have new request."
                                    )
                                    navController.navigateUp()

                                }
                            }*/


                }

            }


        }
        if (showMap) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
                MapboxMap(
                    modifier = Modifier.fillMaxSize(),
                    mapInitOptionsFactory = { context ->
                        MapInitOptions(
                            context = context,
                            styleUri = Style.OUTDOORS,
                        )
                    },
                    mapViewportState = mapViewportState,
                    compassSettings = compassSettings,
                    scaleBarSettings = scaleBarSetting,
                    gesturesSettings = mapBoxUiSettings,
                    attributionSettings = AttributionSettings {
                        enabled = false
                    },
                    onMapClickListener = {
                        Toast.makeText(
                            context,
                            "${it.latitude()},${it.longitude()}",
                            Toast.LENGTH_SHORT
                        ).show()
                        point = it

                        true
                    }
                ) {
                    if (point != null) {
                        PointAnnotation(point = point!!,
                            iconImageBitmap = context.getDrawable(R.drawable.location)!!
                                .toBitmap(),
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "my location",
                                    Toast.LENGTH_SHORT
                                ).show()
                                true
                            }
                        )
                    }
                    if (currentLoc != null) {
                        PointAnnotation(point = currentLoc!!,
                            iconImageBitmap = context.getDrawable(R.drawable.current_location)!!
                                .toBitmap(),
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "my location",
                                    Toast.LENGTH_SHORT
                                ).show()
                                true
                            }
                        )
                    }
                }
                Column {
                    Button(shape = CircleShape, onClick = {

                        scope.launch {
                            while (locationInfo?.latitude == null) {
                                if (permissions.all {
                                        ContextCompat.checkSelfPermission(
                                            context, it
                                        ) == PackageManager.PERMISSION_GRANTED
                                    }) {
                                    //get Location

                                    locationInfo = locationClient.getCurrentLocation(
                                        Priority.PRIORITY_HIGH_ACCURACY,
                                        CancellationTokenSource().token
                                    ).await()
                                    //locationInfo = locationClient.getLastLocation().await()


                                    if (locationInfo?.latitude != null && locationInfo?.longitude != null)
                                        mapViewportState.flyTo(
                                            CameraOptions.Builder().zoom(16.0).center(
                                                Point.fromLngLat(
                                                    locationInfo!!.longitude,
                                                    locationInfo!!.latitude
                                                )
                                            ).build()
                                        )
                                } else launcherMultiplePermissions.launch(permissions)
                                if (locationInfo?.latitude != null) {
                                    currentLoc =
                                        Point.fromLngLat(
                                            locationInfo!!.longitude,
                                            locationInfo!!.latitude
                                        )
                                }
                            }

                        }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Accessibility,
                            contentDescription = "current location"
                        )
                    }
                    Button(onClick = {
                        if (point != null) {
                            showMap = !showMap
                            viewModel.getLocation(
                                point!!.latitude().toString(),
                                point!!.longitude().toString()
                            )
                            showLocationField = true

                        } else Toast.makeText(context, "select location", Toast.LENGTH_SHORT).show()


                    }) {

                        Text(text = "Select")
                    }

                }

            }
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

                        imageVector = Icons.Filled.LocationOn,


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
