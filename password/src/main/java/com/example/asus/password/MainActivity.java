package com.example.asus.password;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private EditText editText = null;
    private EditText show = null;
    private CheckBox checkBox = null;
    private Button But1 = null;
    private TextView txt = null;
    private Button But2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.checkBox = (CheckBox)super.findViewById(R.id.check);
        this.editText = (EditText)super.findViewById(R.id.password);
        this.show = (EditText)super.findViewById(R.id.user);
        this.But1 = (Button)super.findViewById(R.id.login);
        this.But2 = (Button)super.findViewById(R.id.cancel);
        this.txt = (TextView)super.findViewById(R.id.Info);
        this.checkBox.setOnClickListener(new MyPassworf());
        this.But1.setOnClickListener(new Login());
    }

    private class MyPassworf implements OnClickListener{

        public void onClick(View view){

            if (checkBox.isChecked()){      //isChecked();方法判断是否复选框被选中
                //使用setTransformationMethod方法设置密码是否秘文
                //HideReturnsTransformationMethod.getInstance()表示设置成明文
                editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else{
                //PasswordTransformationMethod.getInstance()表示设置明文
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    private class Login implements OnClickListener{

        public void onClick(View view){
            String info = show.getText().toString();
            String info1 = editText.getText().toString();
            if ("vikingweirdo".equals(info)&&"1017730629".equals(info1)){

                    txt.setText("Success");

            }else{
                txt.setText("The ID of Password Error!");
            }
        }
    }

}
