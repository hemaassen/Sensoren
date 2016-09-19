package com.example.helge.sensoren;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private SensorManager sensorManager;
    private Sensor sensor;
    private SensorEventListener listener;
    private HashMap<String, Boolean> hm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensoren = sensorManager.getSensorList(sensor.TYPE_ALL);
        for(Sensor s : sensoren){
            textView.append(s.getName().toString() + "\n");
            textView.append(s.getVendor().toString() + "\n");
            textView.append(Integer.toString(s.getVersion()).toString() + "\n");
        }
    }
}
