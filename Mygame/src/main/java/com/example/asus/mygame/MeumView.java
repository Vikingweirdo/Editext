package com.example.asus.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * MeumView
 *
 * @author asus
 * @time 2016/2/23 14:30
 */
public class MeumView extends View {

    public MeumView(Context context) {
        super(context);
    }

    public MeumView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MeumView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint MenuBackground = new Paint();
        MenuBackground.setARGB(170, 140, 180, 200);   //设置画笔的颜色
        canvas.drawRect(0, 0, getWidth(), getHeight(), MenuBackground);
    }
}
