package com.example.varshakr.mentalhealth;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Main4Activity extends Activity {
     Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;
    int c1=0,c2=0,c3=0,c4=0,c5=0;
    String s1,s2,s3,s4,s5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bt1=(Button)findViewById(R.id.button7);
        bt2=(Button)findViewById(R.id.button4);
        bt3=(Button)findViewById(R.id.button5);
        bt4=(Button)findViewById(R.id.button6);
        bt5=(Button)findViewById(R.id.button3);
        bt6=(Button)findViewById(R.id.button2);
        bt7=(Button)findViewById(R.id.button8);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Questionaire.class);
                startActivity(intent);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Graph.class);
//                intent.putExtra("v1",c1);
//                intent.putExtra("a1",s1);
//                intent.putExtra("v1",c2);
//                intent.putExtra("a1",s2);
//                intent.putExtra("v1",c3);
//                intent.putExtra("a1",s3);
//                intent.putExtra("v1",c4);
//                intent.putExtra("a1",s4);
//                intent.putExtra("v1",c5);
//                intent.putExtra("a1",s5);
                startActivity(intent);
            }
        });

    }
}
