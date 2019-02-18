package com.example.varshakr.mentalhealth;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends Activity {

    String t;
    SQLiteDatabase db;
    Button bt,bt1;
    EditText et1,et2,nationality,dob,occupation;
    RadioGroup rg;
    RadioButton r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt=(Button)findViewById(R.id.bt);
        bt1=(Button)findViewById(R.id.button);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        nationality=(EditText)findViewById(R.id.nation);
        dob=(EditText)findViewById(R.id.db);
        occupation=(EditText)findViewById(R.id.occupy);
        rg=(RadioGroup)findViewById(R.id.r);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==r1.getId())
                {
                    t=r1.getText().toString();
                }
                else if(i==r2.getId())
                {
                    t=r2.getText().toString();
                }
                else
                    t=r3.getText().toString();
            }
        });
        IPDBOpenHelper ip=new IPDBOpenHelper(getApplicationContext());
        db=ip.getWritableDatabase();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues values=new ContentValues();
                values.put("Name",et1.getText().toString());
                values.put("Email",et2.getText().toString());
                values.put("Gender",t);
                values.put("Nationality",nationality.getText().toString());
                values.put("DOB",dob.getText().toString());
                values.put("Occupation",occupation.getText().toString());
                db.insert("USER",null,values);

                Log.d("AAAAAA","value inserted");

                Toast.makeText(getApplicationContext(),"Record added!!",Toast.LENGTH_SHORT).show();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main4Activity.class);

                startActivity(intent);
            }
        });

    }



}
