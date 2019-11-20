package com.example.healthcarefordiabetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.healthcarefordiabetes.model.Diary;
import com.example.healthcarefordiabetes.room_db.DiaryRepository;

public class InsertDiaryActivity extends AppCompatActivity {

    private int mLedgerType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_diary);


        Intent intent = getIntent();
        mLedgerType = intent.getIntExtra("type", 0);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("เพิ่มรายการ");




        Button saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText descriptionEditText = findViewById(R.id.description_edit_text);
                String description = descriptionEditText.getText().toString();

                EditText dateEditText = findViewById(R.id.date_edit);
                String date = dateEditText.getText().toString();


                Diary item = new Diary(0, description,date);

                DiaryRepository repo = new DiaryRepository(InsertDiaryActivity.this);
                repo.insertDiary(item, new DiaryRepository.InsertCallback() {
                    @Override
                    public void onInsertSuccess() {
                        Toast t  = Toast.makeText(InsertDiaryActivity.this , "บันทึกเเรียบร้อย" , Toast.LENGTH_SHORT);
                        t.show();
                        finish();
                    }
                });





            }
        });
    }
}
