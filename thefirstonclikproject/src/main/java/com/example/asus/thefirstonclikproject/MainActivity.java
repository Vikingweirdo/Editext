package com.example.asus.thefirstonclikproject;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {
    private EditText edit = null;
    private Button but = null;
    private TextView txt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.but = (Button) super.findViewById(R.id.mybut);
        this.edit = (EditText) super.findViewById(R.id.myedit);

        this.txt = (TextView) super.findViewById(R.id.mytext);
        this.but.setOnClickListener(new ShowInfo());
        this.edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
            }
        });
    }
    private class ShowInfo implements OnClickListener{

        @Override
        public void onClick(View v) {
            String info = edit.getText().toString();
            txt.setText("显示的结果是："+info);
        }
    }

}
