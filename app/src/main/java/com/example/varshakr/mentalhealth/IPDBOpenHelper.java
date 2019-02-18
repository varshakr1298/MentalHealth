package com.example.varshakr.mentalhealth;

import android.database.sqlite.SQLiteOpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class IPDBOpenHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="IPDB";
    private static final int DB_VERSION=1;

    IPDBOpenHelper(Context context)
    {
        super(context,DB_NAME,null,DB_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String query="CREATE TABLE USER(Id INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,Email TEXT,Gender TEXT,Nationality TEXT,DOB DATE,Occupation TEXT);";
        db.execSQL(query);
        Log.d("AAAAAA","database created");
    }

    public void onUpgrade(SQLiteDatabase db,int OldVersion,int NewVersion)
    {

    }
}
