package com.example.healthcarefordiabetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcarefordiabetes.adapter.DiaryRecyclerViewAdapter;
import com.example.healthcarefordiabetes.model.Diary;
import com.example.healthcarefordiabetes.room_db.DiaryRepository;

import java.util.List;

public class DiaryActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);




        Button addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiaryActivity.this, InsertDiaryActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        reloadData();
    }

    private void reloadData() {
        DiaryRepository repo = new DiaryRepository(DiaryActivity.this);

        repo.getDiary(new DiaryRepository.Callback() {
            @Override
            public void onGetLedger(List<Diary> itemList) {


                RecyclerView recyclerView = findViewById(R.id.recycler_view);
                DiaryRecyclerViewAdapter adapter = new DiaryRecyclerViewAdapter(
                        DiaryActivity.this,
                        R.layout.item_diary,
                        itemList
                );
                recyclerView.setLayoutManager(new LinearLayoutManager(DiaryActivity.this));
                recyclerView.setAdapter(adapter);
            }
        });
    }



}
