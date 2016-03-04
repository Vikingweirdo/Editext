package com.example.asus.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.renderscript.RenderScript;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by asus on 2016/1/22.
 */
public class MyView extends View {
        private Paint paint = null;
        private int x , y;
    public MyView(Context context) {
        super(context);
        inis();
    }

    public MyView(Context context, AttributeSet attrs) {
            super(context, attrs);
            inis();
    }

    public void draw(Canvas canvas){    //画图函数
        super.draw(canvas);
        drawtext(canvas);
        //drawPath(canvas);
        //drawBitmap(canvas);
    }

    private void inis(){        //初始化
        paint = new Paint();
        x = 100;
        y = 100;
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);   //设置是否抗锯齿化
    }
    public void drawtext(Canvas canvas){
        paint.setStrokeWidth(15);//设置画笔的宽度
        //划线

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, x, y, paint);
        //画圆
        /*canvas.drawCircle(200, 300, 50, paint);
        paint.setStyle(Paint.Style.FILL);     //设置画笔的风格是否填充
        paint.setColor(Color.RED);


        //画矩形
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(100, 500, 200, 600, paint);*/


    }

    /**
     * 三角形路径
     * @param canvas
     */
    private void drawPath(Canvas canvas){
        /*Path pa = new Path();
        pa.moveTo(100, 100);
        pa.lineTo(100, 300);
        pa.lineTo(200, 250);
        paint.setColor(Color.GREEN);
        canvas.drawPath(pa, paint);

        Path pa1 = new Path();
        pa1.addCircle(500,500,200,Path.Direction.CW);
        pa1.addCircle(500, 500, 180, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        pa1.moveTo(500, 300);
        pa1.lineTo(500, 700);
        pa1.moveTo(300, 500);
        pa1.lineTo(700, 500);
        paint.setColor(Color.RED);

        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(pa1,paint);*/
    }
    private void drawBitmap (Canvas canvas){
        Bitmap bit = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);
        canvas.drawBitmap(bit, 500, 500, paint);
        canvas.save();
        canvas.translate(getWidth() / 2, getHeight() / 2);//修改图片原点坐标系
        canvas.drawCircle(0, 0, 20, paint);
        canvas.drawLine(0, -getHeight() / 2, 0, getHeight() / 2, paint);
        canvas.drawLine(-getHeight() / 2, 0, getHeight() / 2, 0, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(0);
        canvas.drawCircle(100,100,20,paint);
        /*canvas.drawBitmap(bit,0,0,paint);
        canvas.restore();

        //canvas.rotate(60);  //旋转60

        canvas.drawBitmap(bit,0,0,paint);*/
        canvas.drawRect(200,200,300,300,paint);

    }
    public boolean onTouchEvent(MotionEvent event){
        x = (int)event.getX();
        y = (int)event.getY();
        invalidate();       //更新划线终点位置，达到动态划线
        return super.onTouchEvent(event);
    }

}
