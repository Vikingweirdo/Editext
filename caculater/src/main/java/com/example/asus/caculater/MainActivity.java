package com.example.asus.caculater;

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

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {
    private EditText edit1 = null;
    private EditText edit2 = null;
    private TextView txt = null;
    private TextView Show = null;
    private Button but1 = null;
    private Button but2 = null;
    private Button but3 = null;
    private Button but4 = null;
    private double num1;
    private double num2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.edit1 = (EditText)super.findViewById(R.id.edt1);
        this.edit2 = (EditText)super.findViewById(R.id.edt2);
        this.txt = (TextView)super.findViewById(R.id.tex1);
        this.Show = (TextView)super.findViewById(R.id.tex3);
        this.but1 = (Button)super.findViewById(R.id.bt1);
        this.but2 = (Button)super.findViewById(R.id.bt2);
        this.but3 = (Button)super.findViewById(R.id.bt3);
        this.but4 = (Button)super.findViewById(R.id.bt4);
        but1.setOnClickListener(new Add());
        but2.setOnClickListener(new Delec());
        but3.setOnClickListener(new Mul());
        but4.setOnClickListener(new Div());
    };

    private class Add implements OnClickListener {

        public void onClick(View v) {
            num1 = Integer.parseInt(edit1.getText().toString());
            num2 = Integer.parseInt(edit2.getText().toString());
            txt.setText("+");
            Show.setText(String.valueOf(num1 + num2));
        }
    }
    private class Delec implements OnClickListener {

        public void onClick(View v) {
            num1 = Integer.parseInt(edit1.getText().toString());
            num2 = Integer.parseInt(edit2.getText().toString());
            txt.setText("-");
            Show.setText(String.valueOf(num1-num2));
        }
    }
    private class Mul implements OnClickListener {

        public void onClick(View v) {
            num1 = Integer.parseInt(edit1.getText().toString());
            num2 = Integer.parseInt(edit2.getText().toString());
            txt.setText("*");
            Show.setText(String.valueOf(num1*num2));
        }
    }
    private class Div implements OnClickListener {

        public void onClick(View v) {
            num1 = Integer.parseInt(edit1.getText().toString());
            num2 = Integer.parseInt(edit2.getText().toString());
            txt.setText("/");
            Show.setText(String.valueOf(num1/num2));
        }
    }


}
