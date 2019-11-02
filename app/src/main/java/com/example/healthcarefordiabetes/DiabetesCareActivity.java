package com.example.healthcarefordiabetes;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcarefordiabetes.adapter.Care_RecyclerViewAdapter;
import com.example.healthcarefordiabetes.db.Care_DatabaseHelper;
import com.example.healthcarefordiabetes.model.Care;

import java.util.ArrayList;
import java.util.List;

import static com.example.healthcarefordiabetes.db.Care_DatabaseHelper.TABLE_DIABETES2;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_DESCRIPTION1;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_ID1;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_IMAGE1;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_NAME1;

public class DiabetesCareActivity extends AppCompatActivity {


    private List<Care> mCareList = new ArrayList<>();
    private Care_RecyclerViewAdapter mAdapter;

    private Care_DatabaseHelper mDbHepler;
    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_care);

        //    populateData();
        mDbHepler = new Care_DatabaseHelper(DiabetesCareActivity.this);
        mDatabase = mDbHepler.getWritableDatabase();

        readformDb();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new Care_RecyclerViewAdapter(
                DiabetesCareActivity.this,
                R.layout.item_diabetes,
                mCareList

        );

        LinearLayoutManager lm = new LinearLayoutManager(this );


        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(mAdapter);





    }

    private void readformDb() {

        mCareList.clear();
        Cursor cursor = mDatabase.query(TABLE_DIABETES2,null, null,null,null,null,null);

        while (cursor.moveToNext()){
            int id=  cursor.getInt(cursor.getColumnIndex(COL_ID1));
            String name = cursor.getString(cursor.getColumnIndex(COL_NAME1));
            String description = cursor.getString(cursor.getColumnIndex(COL_DESCRIPTION1));
            int image  = cursor.getInt(cursor.getColumnIndex(COL_IMAGE1));

            Care care = new Care(id,name,description,image);
            mCareList.add(care);
        }
    }

    private void populateData() {


/*        Place place = new Place("พระปฐมเจดีย์","เมือง",R.drawable.ongpha);
        mPlaceList.add(place);

        place = new Place("บ้านปายนา","นครชัยศรี",R.drawable.paina1);
        mPlaceList.add(place);

        place = new Place("พิพิธภัณฑ์รถเก่า","นครชัยศรี",R.drawable.jesadatechnikmuseum);
        mPlaceList.add(place);

        place = new Place("ตลาดท่านา","นครชัยศรี",R.drawable.thana);
        mPlaceList.add(place);

        place = new Place("วัดกลางบางแก้ว","นครชับศรี",R.drawable.watklangbangkaew);
        mPlaceList.add(place);

        place = new Place("ตลาดน้ำลำพญา","บางเลน",R.drawable.lamphaya);
        mPlaceList.add(place);

        place = new Place("ตลาดน้ำทุ่งบัวแดง","บางเลน",R.drawable.tungbuadang);
        mPlaceList.add(place);

        place = new Place("Tree & Tide Riverside","บางเลน",R.drawable.treetideriverside);
        mPlaceList.add(place);
     */
    }

}

