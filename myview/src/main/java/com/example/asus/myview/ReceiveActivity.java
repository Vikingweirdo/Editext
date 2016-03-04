package com.example.asus.myview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.widget.Chronometer;
import android.widget.TextView;


public class ReceiveActivity extends ActionBarActivity {
    private TextView textView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.receive_main);
        this.textView = (TextView)super.findViewById(R.id.receive);
        Intent it = super.getIntent();//取得当前的Intent
        String info = it.getStringExtra("MLDN");
        this.textView.setText(info);
    }

}
