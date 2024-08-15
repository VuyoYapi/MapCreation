package com.example.mapscreation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(),OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val mapFragment = supportFragmentManager
             .findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap){
        //rc pin
        val RosebankCollege = LatLng(-25.7461,28.1881)
        googleMap.addMarker(
            MarkerOptions()
                .position(RosebankCollege)
                .title("Campus")

        )
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(RosebankCollege,15f))
    }

}