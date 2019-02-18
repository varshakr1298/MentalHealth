package com.example.varshakr.mentalhealth;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends Activity {
    SQLiteDatabase db;
    Button bt;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv=(TextView)findViewById(R.id.t1);
        bt=(Button)findViewById(R.id.bt);

        IPDBOpenHelper ip=new IPDBOpenHelper(getApplicationContext());
        db=ip.getWritableDatabase();
        Cursor cr= db.query("USER",new String[]{"Id","Name","Email","Gender","Nationality","DOB","Occupation"},null,null,null,null,null);

        String st = "\n\n\nId        Name                Email                                    Gender           Nationality         DOB           Occupation\n\n";
        while(cr.moveToNext())
        {
            st = st + " "+cr.getInt(0)+"        "+cr.getString(1)+"         "+cr.getString(2)+"                  "+cr.getString(3)+"            "+cr.getString(4)+"            "+cr.getString(5)+"          "+cr.getString(6)+"\n\n";
        }
        tv.setText(st);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
