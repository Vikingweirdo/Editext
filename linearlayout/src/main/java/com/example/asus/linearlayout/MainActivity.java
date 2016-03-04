package com.example.asus.linearlayout;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);//�������Բ���

        LinearLayout.LayoutParams txtparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT);
        TextView tex = new TextView(this);//�����齨����
        tex.setLayoutParams(txtparams);//�����齨����
        tex.setText("��̬�������Բ���");//
        tex.setTextSize(20);
        layout.addView(tex,txtparams);
        super.setContentView(layout,params);
    }
}
