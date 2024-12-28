package com.koDea.fixMasterClient.presentation.SearchOnMap

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Adjust
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.viewinterop.NoOpUpdate
import androidx.core.graphics.drawable.toBitmap
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapView
import com.mapbox.maps.Style
import com.mapbox.maps.plugin.animation.flyTo
import com.mapbox.maps.plugin.annotation.annotations
import com.mapbox.maps.plugin.annotation.generated.OnPointAnnotationClickListener
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions
import com.mapbox.maps.plugin.annotation.generated.createPointAnnotationManager

@SuppressLint("RememberReturnType", "UseCompatLoadingForDrawables")
@Composable
fun MapBoxMap(
    modifier: Modifier = Modifier,
    myLocation: Point?,
    handyManList : List<HandyMan?>,
) {

    val context = LocalContext.current
    val marker = remember(context) {
        context.getDrawable(R.drawable.current_location)!!.toBitmap()
    }

    val handyMenMarker = remember(context) {
        context.getDrawable(R.drawable.location)!!.toBitmap()
    }



    var pointAnnotationManager: PointAnnotationManager? by remember {
        mutableStateOf(null)
    }
    AndroidView(
        factory = {
            MapView(it).also { mapView ->
                mapView.getMapboxMap().loadStyleUri(Style.OUTDOORS)
                val annotationApi = mapView.annotations
                pointAnnotationManager = annotationApi.createPointAnnotationManager()
            }
        },
        update = { mapView ->
            if (myLocation != null) {
                pointAnnotationManager?.let {
                    it.deleteAll()
                    val pointAnnotationOptions = PointAnnotationOptions()
                        .withPoint(myLocation)
                        .withIconImage(marker)

                    it.create(pointAnnotationOptions)
                    mapView.getMapboxMap()
                        .flyTo(CameraOptions.Builder().zoom(16.0).center(myLocation).build())
                    pointAnnotationManager!!.addClickListener(OnPointAnnotationClickListener {
                        Toast.makeText(context , "clicked !!" , Toast.LENGTH_SHORT).show()
                        true
                    })

                    /*val p = PointAnnotationOptions()
                        .withPoint(Point.fromLngLat(2.8770072419209303 ,36.50321008456727))
                        .withIconImage(marker)
                    it.create(p)*/
                    handyManList.forEach { handyMen ->
                        if (handyMen!!.Latitude.isNotEmpty() && handyMen.Longitude.isNotEmpty()){
                            val p = PointAnnotationOptions()
                                .withPoint(Point.fromLngLat(handyMen.Longitude.toDouble(),handyMen.Latitude.toDouble()))
                                .withIconImage(handyMenMarker)
                            it.create(p)

                        }
                    }
                }
            }
            NoOpUpdate
        },
        modifier = modifier
    )
}