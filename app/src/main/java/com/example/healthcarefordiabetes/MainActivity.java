package com.example.healthcarefordiabetes;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthcarefordiabetes.adapter.RecyclerViewAdapter;
import com.example.healthcarefordiabetes.db.DatabaseHelper;
import com.example.healthcarefordiabetes.model.Diabetes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Diabetes> mDiabetesList = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private DatabaseHelper mDbHepler;
    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button meanButton = findViewById(R.id.diabetes_mean_button);
        meanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiabetesDetailActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

        Button careButton = findViewById(R.id.care_button);
        careButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiabetesCareActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });



        Button writeButton = findViewById(R.id.write_button);
        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WriteActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });


    }



}
