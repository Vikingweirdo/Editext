package com.example.asus.myview;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {
    private Chronometer chronometer = null;
    private Button button = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.button = (Button)super.findViewById(R.id.send);
        this.chronometer = (Chronometer)super.findViewById(R.id.time);
        this.chronometer.setOnChronometerTickListener(new OnChronometerTickListenerImpl());
    }

    private class OnChronometerTickListenerImpl implements Chronometer.OnChronometerTickListener {

        @Override
        public void onChronometerTick(Chronometer chronometer) {
            String Time = chronometer.getText().toString();
            System.out.println("time = "+Time);
            if("00:05".equals(Time)){
                Intent it = new Intent(MainActivity.this, ReceiveActivity.class);
                MainActivity.this.startActivity(it);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() != MotionEvent.ACTION_DOWN){
            return super.onTouchEvent(event);
        }

        int x = (int)event.getX();
        int y = (int)event.getY();

        if (x<200&&y<200){
            this.chronometer.start();
            /*Intent it = new Intent(MainActivity.this, ReceiveActivity.class);
            MainActivity.this.startActivity(it);*/

        }

        return true;
    }
}
