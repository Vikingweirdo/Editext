package com.example.asus.view;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //super. setContentView(R.layout.activity_main);
        //setContentView(new MyView(this));
        super.setContentView(new MyView(this));
    }

}
