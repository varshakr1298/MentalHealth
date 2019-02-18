package com.example.varshakr.mentalhealth;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Questionaire extends Activity {
    SeekBar seekBar,seekBar1,seekBar2,seekBar3;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionaire);
        seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekBar1=(SeekBar)findViewById(R.id.seekBar2);
        seekBar2=(SeekBar)findViewById(R.id.seekBar3);
        seekBar3=(SeekBar)findViewById(R.id.seekBar4);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t7=(TextView)findViewById(R.id.textView8);
        t8=(TextView)findViewById(R.id.textView9);
        // t1.setText("Covered:"+seekBar.getProgress()+"/"+seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue=progress;
                Toast.makeText(getApplicationContext(),"Changing seekbars progress",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Started tracking seekbars",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                t2.setText("Covered: "+progressValue+"/"+seekBar.getMax());
                Toast.makeText(getApplicationContext(),"Stopped tracking seekbars",Toast.LENGTH_SHORT).show();
            }
        });
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue=progress;
                Toast.makeText(getApplicationContext(),"Changing seekbars progress",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Started tracking seekbars",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                t4.setText("Covered: "+progressValue+"/"+seekBar.getMax());
                Toast.makeText(getApplicationContext(),"Stopped tracking seekbars",Toast.LENGTH_SHORT).show();
            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue=progress;
                Toast.makeText(getApplicationContext(),"Changing seekbars progress",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Started tracking seekbars",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                t6.setText("Covered: "+progressValue+"/"+seekBar.getMax());
                Toast.makeText(getApplicationContext(),"Stopped tracking seekbars",Toast.LENGTH_SHORT).show();
            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue=progress;
                Toast.makeText(getApplicationContext(),"Changing seekbars progress",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Started tracking seekbars",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                t8.setText("Covered: "+progressValue+"/"+seekBar.getMax());
                Toast.makeText(getApplicationContext(),"Stopped tracking seekbars",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
