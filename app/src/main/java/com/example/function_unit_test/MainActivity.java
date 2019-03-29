package com.example.function_unit_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btn1 = this.findViewById(R.id.button);
        Button btn2 = this.findViewById(R.id.button2);

        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click();
            }

        });*/
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_toast();
            }
        });

    }
    public void  btn_click(){
        Intent intent=new Intent(MainActivity.this,ActivityTwo.class);
        startActivity(intent);
    }
    public void btn_toast(){
        EditText text1 = this.findViewById(R.id.editText);
        String info = text1.getText().toString();
        Toast.makeText(MainActivity.this,info,Toast.LENGTH_SHORT).show();
    }
}
