package com.example.asus.timepicker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TimePicker;


public class MainActivity extends ActionBarActivity {
    private TimePicker tp = null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tp = (TimePicker)super.findViewById(R.id.tim2);
        this.tp.setCurrentHour(18);
        this.tp.setIs24HourView(true);
        this.tp.setCurrentMinute(30);
    }
}
