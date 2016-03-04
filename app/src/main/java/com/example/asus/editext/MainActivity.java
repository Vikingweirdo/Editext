package com.example.asus.editext;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private EditText edit = null;       //作为属性出现

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.edit = (EditText) super.findViewById(R.id.edit2);
        this.edit.setEnabled(false);    //设置不可编辑
    }

}
