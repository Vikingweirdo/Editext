package com.example.asus.mygame;

import android.app.Notification;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.util.AttributeSet;

/**
 * MyView
 *
 * @author asus
 * @time 2016/2/21 15:23
 */
public class MyView extends View {
    //游戏宽度和高度
    private float width;
    private float heigth;



    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    

    @Override
    protected void onDraw(Canvas canvas) {
        /*Paint paint = new Paint();  //生成画笔
        //paint.setColor(Color.BLUE);//设置画笔颜色
        paint.setARGB(150, 0, 100, 200);//设置画笔颜色 A：透明度，0完全透明，255完全不透明 R：红色颜色浓度 G：绿色浓度 B：蓝色浓度
        //paint.setStyle(Paint.Style.STROKE);//画框
        //paint.setStrokeWidth(10);//框的粗细
        paint.setTextSize(100);
        //canvas.drawLine(0,0,200,200,paint);//在（0，0）和(200,200)两点画蓝色线

        //画矩形
        canvas.drawRect(100, 400, 500, 500, paint);

        //画圆
        canvas.drawCircle(200, 200, 150, paint);

        //写字符串
        canvas.drawText("Start", 50, 200, paint);

        //导入图片
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher), 100, 300, paint);
        super.onDraw(canvas);*/

        Paint backgroundPaint = new Paint();
        backgroundPaint.setARGB(170, 140, 180, 200);   //设置画笔的颜色
        canvas.drawRect(0, 0, getWidth(), getHeight(), backgroundPaint);

        Paint PushButten1 = new Paint();
        PushButten1.setARGB(200, 110, 150, 160);
        PushButten1.setStyle(Paint.Style.STROKE);
        PushButten1.setStrokeWidth(6);
        canvas.drawCircle(350, 880, 150, PushButten1);

        Paint PushButten2 = new Paint();
        PushButten2.setARGB(200, 180, 150, 148);
        PushButten2.setStyle(Paint.Style.FILL);
        PushButten2.setStrokeWidth(5);
        canvas.drawCircle(350, 880, 147, PushButten2);

        Paint Text = new Paint();
        Text.setARGB(150, 200, 110, 150);
        Text.setTextSize(80);
        canvas.drawText("Push", 260, 900, Text);

        /*Paint show = new Paint();
        show.setColor(Color.BLACK);
        show.setTextSize(50);
        String text = String.valueOf(count);
        canvas.drawText(text, 320, 200, show);*/

    }


}


