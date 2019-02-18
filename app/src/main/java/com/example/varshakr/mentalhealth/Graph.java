package com.example.varshakr.mentalhealth;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class Graph extends Activity {

    LineChart lineChart;

    ArrayList<String> xAxes= new ArrayList<>();
    ArrayList<Entry> yAxes = new ArrayList<>();

    ArrayList<ILineDataSet> lineDataSets = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        lineChart = (LineChart) findViewById(R.id.linechart);
        xAxes.add("Sad");
        xAxes.add("Happy");
        xAxes.add("Anxious");
        xAxes.add("Relaxed");
        xAxes.add("Angry");

        yAxes.add(new Entry(8,0));
        yAxes.add(new Entry(2,1));
        yAxes.add(new Entry(0,2));
        yAxes.add(new Entry(3,3));
        yAxes.add(new Entry(2,4));

        String[] xaxes = new String[xAxes.size()];


        for(int i=0;i<xAxes.size();i++)
        {
            xaxes[i] = xAxes.get(i).toString();
        }


        LineDataSet lineDataSet = new LineDataSet(yAxes,"values");

        lineDataSet.setDrawCircles(true);

        lineDataSet.setColor(Color.BLUE);

        lineDataSets.add(lineDataSet);


        lineChart.setData(new LineData(xaxes,lineDataSets));

        lineChart.setVisibleXRangeMaximum(65f);
        lineChart.setTouchEnabled(true);

        lineChart.setDragEnabled(true);




    }
}
