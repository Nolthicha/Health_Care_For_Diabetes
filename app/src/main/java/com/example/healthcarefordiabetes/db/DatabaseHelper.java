package com.example.healthcarefordiabetes.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.healthcarefordiabetes.R;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_DIABETES1 = "diabetes";





    public static final String COL_ID1 = "_id";
    public static final String COL_NAME1 = "name";
    public static final String COL_DESCRIPTION1 = "description";
    public static final String COL_IMAGE1 = "image";

    private static final String SQL_CREATE_DIABETES1 =
            "CREATE TABLE " + TABLE_DIABETES1 + " ("
                    + COL_ID1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME1 + " TEXT, "
                    + COL_DESCRIPTION1 + " TEXT, "
                    + COL_IMAGE1 + " INTEGER )";






    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DIABETES1);



        ContentValues cv = new ContentValues();
        cv.put(COL_NAME1, "โรคเบาหวาน คืออะไร");
        cv.put(COL_DESCRIPTION1, "โรคเบาหวานเป็นโรคที่เกิดจากการกินหวานมากเกินไป");
        cv.put(COL_IMAGE1, R.drawable.heartbeat);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "สถิติเกี่ยวกับโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, "นครชัยศรี");
        cv.put(COL_IMAGE1, R.drawable.heartbeat);
        db.insert(TABLE_DIABETES1, null, cv);


        cv.put(COL_NAME1, "ชนิดของโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, "โรคเบาหวานเป็นโรคที่เกิดจากการกินหวานมากเกินไป");
        cv.put(COL_IMAGE1, R.drawable.heartbeat);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "อาการของโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, "นครชัยศรี");
        cv.put(COL_IMAGE1, R.drawable.heartbeat);
        db.insert(TABLE_DIABETES1, null, cv);


        cv.put(COL_NAME1, "โรคเบาหวานกับภาวะแทรกซ้อน");
        cv.put(COL_DESCRIPTION1, "โรคเบาหวานเป็นโรคที่เกิดจากการกินหวานมากเกินไป");
        cv.put(COL_IMAGE1, R.drawable.heartbeat);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "การตรวจหาโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, "นครชัยศรี");
        cv.put(COL_IMAGE1, R.drawable.heartbeat);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "พุงใหญ่กับเบาหวาน");
        cv.put(COL_DESCRIPTION1, "นครชัยศรี");
        cv.put(COL_IMAGE1, R.drawable.heartbeat);
        db.insert(TABLE_DIABETES1, null, cv);








    }





    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
