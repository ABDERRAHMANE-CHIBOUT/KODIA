package com.koDea.fixMasterClient.presentation.SearchOnMap

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.presentation.common.cardProvider
import com.koDea.fixMasterClient.presentation.search.SearchViewModel
import com.koDea.fixMasterClient.util.Response
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapInitOptions
import com.mapbox.maps.Style
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.animation.viewport.rememberMapViewportState
import com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotation
import com.mapbox.maps.extension.compose.annotation.generated.PointAnnotation
import com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroup
import com.mapbox.maps.plugin.animation.flyTo
import com.mapbox.maps.plugin.annotation.annotations
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings
import com.mapbox.maps.plugin.compass.generated.CompassSettings
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

@SuppressLint("CoroutineCreationDuringComposition", "UseCompatLoadingForDrawables")
@Composable
fun SearchOnMap(viewModel: SearchViewModel = hiltViewModel(), navController: NavHostController) {

    var showCard by remember {
        mutableStateOf(false)
    }
    var item by remember {
        mutableStateOf(HandyMan())
    }

    val context = LocalContext.current
    val locationClient = remember { LocationServices.getFusedLocationProviderClient(context) }

    var text by rememberSaveable {
        mutableStateOf("")
    }
    val radioOptionsSearch = listOf("Name", "Category", "Location")
    val (selectedOptionSearch, onOptionSelectedSearch) = remember {
        mutableStateOf(
            radioOptionsSearch[0]
        )
    }
    val radioOptionsOrder = listOf("Price", "Rating")
    val (selectedOptionOdrer, onOptionSelectedOrder) = remember {
        mutableStateOf(
            radioOptionsOrder[0]
        )
    }
    var showSearch by remember {
        mutableStateOf(true)
    }
    var handyManList by remember {
        mutableStateOf(listOf<HandyMan?>())
    }


    viewModel.getHandyManList(text, selectedOptionSearch)
    when (val resp = viewModel.searchList.value) {
        is Response.onLoading -> {}
        is Response.onFaillure -> {}
        is Response.onSuccess -> {
            handyManList = resp.data
        }
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {

        var point by rememberSaveable {
            mutableStateOf<Point?>(null)
        }
        var relaunch by remember {
            mutableStateOf(false)
        }

        val permissions = arrayOf(
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION
        )


        val marker = remember(context) {
            context.getDrawable(R.drawable.current_location)!!.toBitmap()
        }

        val handyMenMarker = remember(context) {
            context.getDrawable(R.drawable.location)!!.toBitmap()
        }


        var pointAnnotationManager: PointAnnotationManager? by remember {
            mutableStateOf(null)
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
            ) {
                if (point != null) {
                    /*CircleAnnotation(
                        point = point!!,
                        circleRadius = 20.0,
                        //circleColorInt = ,
                        onClick = {
                            Toast.makeText(
                                context,
                                "Clicked on Circle Annotation: $it",
                                Toast.LENGTH_SHORT
                            ).show()
                            true
                        }
                    )*/
                    PointAnnotation(point = point!!,
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

                PointAnnotationGroup(annotations = handyManList.filter { it!!.Latitude.isNotEmpty() && it!!.Longitude.isNotEmpty() }.map {
                    PointAnnotationOptions()
                        .withPoint(
                            Point.fromLngLat(
                                it!!.Longitude.toDouble(),
                                it.Latitude.toDouble()
                            )
                        )
                        .withIconImage(context.getDrawable(R.drawable.location)!!.toBitmap())
                },
                    onClick = {
                        val x = handyManList.find { handyMan ->
                            it.geometry.latitude().toString().equals(handyMan!!.Latitude.toString())
                        }
                        val y = handyManList.find { handyMan ->
                            it.geometry.longitude().toString().equals(handyMan!!.Longitude)
                        }
                        if (x?.id == y?.id)
                            Toast.makeText(
                                context,
                                "${x?.FirstName} , ${x?.LastName}",
                                Toast.LENGTH_SHORT
                            ).show()
                        item = x!!
                        showCard = true
                        //Toast.makeText(context , "${it.geometry.latitude()},${it.geometry.longitude()}" , Toast.LENGTH_SHORT).show()
                        true
                    })

                /* handyManList.forEach { handyman ->
                     val options = PointAnnotationOptions()
                         .withPoint(Point.fromLngLat(handyman!!.Longtitude.toDouble(), handyman.Latitude.toDouble()))
                         .withIconImage(context.getDrawable(R.drawable.location)!!.toBitmap())
                        // .withIconSize(1.0f)
                         .withTextField(handyman.FirstName)

                     val annotation = pointAnnotationManager!!.create(options)

                 }*/

                /*this.addOnSymbolClickListener { symbol ->
                    val annotation = symbolManager.annotations.find { it.id == symbol.id }
                    val clickedHandyman = handymanList.find { handyman ->
                        annotation?.geometry?.latitude() == handyman.latitude &&
                                annotation?.geometry?.longitude() == handyman.longitude
                    }
                    if (clickedHandyman != null) {
                        // Handle the click event here
                        // You can navigate to another screen or show a card here
                        true
                    } else {
                        false
                    }
                }*/

                // You can Draw the Map Markers here.

            }
            IconButton(onClick = {

                scope.launch {
                    while (locationInfo?.latitude == null) {
                        if (permissions.all {
                                ContextCompat.checkSelfPermission(
                                    context, it
                                ) == PackageManager.PERMISSION_GRANTED
                            }) {
                            //get Location

                            locationInfo = locationClient.getCurrentLocation(
                                Priority.PRIORITY_HIGH_ACCURACY, CancellationTokenSource().token
                            ).await()
                            //locationInfo = locationClient.getLastLocation().await()


                            if (locationInfo?.latitude != null && locationInfo?.longitude != null)
                                mapViewportState.flyTo(CameraOptions.Builder().zoom(16.0).center(
                                    Point.fromLngLat(locationInfo!!.longitude , locationInfo!!.latitude)).build())
                        } else launcherMultiplePermissions.launch(permissions)
                        relaunch = !relaunch
                        if (locationInfo?.latitude != null) {
                            point =
                                Point.fromLngLat(locationInfo!!.longitude, locationInfo!!.latitude)
                        }
                    }

                }
            }) {
                Icon(
                    imageVector = Icons.Filled.Accessibility,
                    contentDescription = "current location"
                )
            }

        }

        /*AndroidView(
            factory = {
                MapView(it).also { mapView ->
                    mapView.getMapboxMap().loadStyleUri(Style.OUTDOORS)
                    val annotationApi = mapView.annotations
                    pointAnnotationManager = annotationApi.createPointAnnotationManager()
                }
            },
            update = { mapView ->
                if (point != null) {
                    pointAnnotationManager?.let {
                        it.deleteAll()
                        val pointAnnotationOptions = PointAnnotationOptions()
                            .withPoint(point!!)
                            .withIconImage(marker)

                        it.create(pointAnnotationOptions)
                        mapView.getMapboxMap()
                            .flyTo(CameraOptions.Builder().zoom(16.0).center(point).build())
                    }
                }
                pointAnnotationManager?.let {
                    handyManList.forEach { handyMen ->
                        if (handyMen!!.Latitude.isNotEmpty() && handyMen.Longtitude.isNotEmpty()) {
                            val p = PointAnnotationOptions()
                                .withPoint(
                                    Point.fromLngLat(
                                        handyMen.Longtitude.toDouble(),
                                        handyMen.Latitude.toDouble()
                                    )
                                )
                                .withIconImage(handyMenMarker)
                            it.create(p)
                            pointAnnotationManager!!.addClickListener(
                                OnPointAnnotationClickListener {
                                    Toast.makeText(context, item.FirstName + item.LastName, Toast.LENGTH_SHORT)
                                        .show()
                                    item = handyMen
                                    showCard = !showCard
                                    mapView.getMapboxMap().flyTo(
                                        CameraOptions.Builder().zoom(16.0).center(it.point)
                                            .build()
                                    )
                                    true
                                })

                        }
                    }

                }


                NoOpUpdate
            },
            modifier = Modifier.fillMaxSize()
        )*/


        var expanded by remember {
            mutableStateOf(false)
        }
        //Text(text = "Map")
        Column {
            //if (showSearch) {
            androidx.compose.material3.OutlinedTextField(value = text, onValueChange = {
                text = it
                viewModel.getHandyManList(text, selectedOptionSearch)
                showCard = false
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
                                androidx.compose.material3.Text(
                                    text = "Search :",
                                    modifier = Modifier.padding(horizontal = 36.dp)
                                )
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
                                        RadioButton(
                                            selected = (text == selectedOptionSearch),
                                            onClick = { onOptionSelectedSearch(text) },
                                        )
                                        androidx.compose.material3.Text(
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
                                androidx.compose.material3.Text(
                                    text = "Order :",
                                    modifier = Modifier.padding(horizontal = 36.dp)
                                )
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
                                        RadioButton(
                                            selected = (text == selectedOptionOdrer),
                                            onClick = { onOptionSelectedOrder(text) },
                                        )
                                        androidx.compose.material3.Text(
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
                placeholder = { androidx.compose.material3.Text(text = "Search by " + selectedOptionSearch) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                shape = AbsoluteRoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = MaterialTheme.colorScheme.background,
                    unfocusedContainerColor = MaterialTheme.colorScheme.background
                )
            )
            //}
            if (showCard) {
                cardProvider(item = item, navController = navController)
            }

        }
    }

}


//36.50321008456727, 2.8770072419209303