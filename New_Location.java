package com.example.blackoutapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.view.View;
import android.widget.TextView;
 
import android.util.Log;
 
public class New_Location extends Activity implements LocationListener{
protected LocationManager locationManager;
protected LocationListener locationListener;
protected Context context;
TextView txtLat;
String lat;
String provider;
protected String latitude,longitude; 
protected boolean gps_enabled,network_enabled;
 
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_get_drunk);
txtLat = (TextView) findViewById(R.id.new_location_content);
 
locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
}
@Override
public void onLocationChanged(Location location) {
txtLat = (TextView) findViewById(R.id.new_location_content);
txtLat.setText("Latitude:" + location.getLatitude() + ", Longitude:" + location.getLongitude());
}

@Override
public void onProviderDisabled(String provider) {
Log.d("Latitude","disable");
}
 
@Override
public void onProviderEnabled(String provider) {
Log.d("Latitude","enable");
}
 
public void print(View view) {
	// Hi.
}
@Override
public void onStatusChanged(String provider, int status, Bundle extras) {
Log.d("Latitude","status");
}
}