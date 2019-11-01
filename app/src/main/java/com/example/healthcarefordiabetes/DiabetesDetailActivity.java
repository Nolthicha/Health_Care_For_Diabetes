package com.example.healthcarefordiabetes;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcarefordiabetes.adapter.RecyclerViewAdapter;
import com.example.healthcarefordiabetes.db.DatabaseHelper;
import com.example.healthcarefordiabetes.model.Diabetes;

import java.util.ArrayList;
import java.util.List;

import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_DESCRIPTION1;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_ID1;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_IMAGE1;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.COL_NAME1;
import static com.example.healthcarefordiabetes.db.DatabaseHelper.TABLE_DIABETES1;

public class DiabetesDetailActivity extends AppCompatActivity {


    private List<Diabetes> mDiabetesList = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private DatabaseHelper mDbHepler;
    private SQLiteDatabase mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_detail);

        //    populateData();
        mDbHepler = new DatabaseHelper(DiabetesDetailActivity.this);
        mDatabase = mDbHepler.getWritableDatabase();

        readformDb();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new RecyclerViewAdapter(
                DiabetesDetailActivity.this,
                R.layout.item_diabetes,
                mDiabetesList

        );

        LinearLayoutManager lm = new LinearLayoutManager(this );


        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(mAdapter);





    }

    private void readformDb() {

        mDiabetesList.clear();
        Cursor cursor = mDatabase.query(TABLE_DIABETES1,null, null,null,null,null,null);

        while (cursor.moveToNext()){
            int id=  cursor.getInt(cursor.getColumnIndex(COL_ID1));
            String name = cursor.getString(cursor.getColumnIndex(COL_NAME1));
            String description = cursor.getString(cursor.getColumnIndex(COL_DESCRIPTION1));
            int image  = cursor.getInt(cursor.getColumnIndex(COL_IMAGE1));

            Diabetes diabetes = new Diabetes(id,name,description,image);
            mDiabetesList.add(diabetes);
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

