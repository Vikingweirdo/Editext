package com.example.asus.radiolisten;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView txt = null;
    private RadioGroup sex = null;
    private RadioButton but1 = null;
    private RadioButton but2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.txt = (TextView)super.findViewById(R.id.show);
        this.sex = (RadioGroup)super.findViewById(R.id.sex);
        this.but1 = (RadioButton)super.findViewById(R.id.female);
        this.but2 = (RadioButton)super.findViewById(R.id.male);
        sex.setOnCheckedChangeListener(new OnCheckedChangeListenerIMPL());

    }
    private class OnCheckedChangeListenerIMPL implements RadioGroup.OnCheckedChangeListener {


        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            String temp = null;
            if (but1.getId()==checkedId){
                temp = but1.getText().toString();
            }
            if (but2.getId() == checkedId){
                temp = but2.getText().toString();
            }
            txt.setText("您的性别是:"+temp);
        }
    }
}
