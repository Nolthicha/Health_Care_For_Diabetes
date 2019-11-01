package com.example.healthcarefordiabetes;

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

public class DiabetesCareActivity extends AppCompatActivity {


    private List<Diabetes> mDiabetesList = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private DatabaseHelper mDbHepler;
    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_care);

           populateData();
        mDbHepler = new DatabaseHelper(DiabetesCareActivity.this);
        mDatabase = mDbHepler.getWritableDatabase();

        //readformDb();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new RecyclerViewAdapter(
                DiabetesCareActivity.this,
                R.layout.item_diabetes,
                mDiabetesList

        );

        LinearLayoutManager lm = new LinearLayoutManager(this );


        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(mAdapter);





    }


    private void populateData() {


        Diabetes diabetes = new Diabetes(0,"เมือง","ewded",R.drawable.heartbeat);
        mDiabetesList.add(diabetes);

        diabetes = new Diabetes(1,"นครชัยศรี","llll",R.drawable.heartbeat);
        mDiabetesList.add(diabetes);




    }

}

