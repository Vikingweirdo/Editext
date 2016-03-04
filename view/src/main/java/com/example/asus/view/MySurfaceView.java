package com.example.asus.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.util.Log;

import java.security.Key;
import java.util.concurrent.ExecutionException;

/**
 * Created by asus on 2016/1/22.
 */
public abstract class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public final static String TAG = "MySurfaseView";
    private SurfaceHolder holder;
    private Canvas canvas;
    private Paint paint;
    private Thread  thread ;
    private boolean flag;
    private float x , y;
    private float speedx,speedy;

    public MySurfaceView(Context context) {
        super(context);
        inis();
    }

    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inis();
    }
    public void surfaseCreat(SurfaceHolder holder){
        Log.i(TAG, "surfaseCreat");
        flag = true;
        iniGame();
        thread = new Thread();
        thread.start();



    }
    public void surfaseChanges(SurfaceHolder holder){
        Log.i(TAG, "surfaseChanges");
    }
    public void surfaseDestoryed(SurfaceHolder holder){
        Log.i(TAG,"surfaseDestoryed");
        flag = false;
    }
    public void iniGame(){
        x = 0;
        y = 0;
        speedx = 10;
        speedy = 20;
    }

    /**
     * 初始化
     */
    private void inis(){
        holder = getHolder();
        holder.addCallback(this);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);


    }

    public void myDraw(Canvas canvas){
        paint.setColor(Color.WHITE);
        canvas.drawRect(0, 0, getWidth(), getHeight(), paint);
        canvas.drawCircle(500, 500, 100, paint);
    }

    public void logic(){

        x +=speedx;
        y +=speedy;
    }

    public boolean onTouchEvent(MotionEvent event){

        return super.onTouchEvent(event);
    }

    public boolean onKetDown(int keycode , KeyEvent event){

        return super.onKeyDown(keycode,event);
    }

    public void run(){
        while (flag){
            long start = System.currentTimeMillis();
            canvas = holder.lockCanvas();
            if (null != canvas) {
                myDraw(canvas);

            }
            logic();

            long end = System.currentTimeMillis();

            if (end - start < 50){

                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
