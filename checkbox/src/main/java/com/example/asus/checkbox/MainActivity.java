package com.example.asus.checkbox;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;


public class MainActivity extends ActionBarActivity {
    private CheckBox ch = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.ch = (CheckBox) super.findViewById(R.id.Ch1);
        this.ch.setChecked(true);
    }

}
