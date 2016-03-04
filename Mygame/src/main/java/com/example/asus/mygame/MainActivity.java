package com.example.asus.mygame;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;
import android.view.View.OnClickListener;
import org.w3c.dom.Text;
import android.app.Activity;


public class MainActivity extends Activity {

    private Chronometer mychronometer = null;
    private int count = 0;

    private TextView txt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        //setContentView(new MyView(this));
        this.mychronometer = (Chronometer)super.findViewById(R.id.mychronometer);
        txt = (TextView)super.findViewById(R.id.txt);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        if (event.getAction() != MotionEvent.ACTION_DOWN) {
            return super.onTouchEvent(event);
        }

        int x = (int) event.getX();
        int y = (int) event.getY();
        int k = 0;

        if (x >= 203 && x <= 497 && y >= 733 && y <= 1027) {
            count++;
            k = count;
            String say = String.valueOf(count);
            txt.setText(say);


            this.mychronometer.start();
            System.out.println(count);
            /*invalidate();调用invalidate()方法会导致视图进行重绘
            myView = new MyView(this);
            myView.setCount(count);
            System.out.println(count);*/
        }

        if(k >= 10){

            this.mychronometer.stop();
        }

        return true;
    }

}
