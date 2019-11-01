package com.example.healthcarefordiabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_detail);

        Intent intent = getIntent();
        String diabetesName = intent.getStringExtra("name");
        String diabetesDescription = intent.getStringExtra("description");




        TextView diabetesNameTextView = findViewById(R.id.in_name_text_view);
        diabetesNameTextView.setText(diabetesName);

        TextView diabetesDescriptionTextView = findViewById(R.id.description_text_view);
        diabetesDescriptionTextView.setText(diabetesDescription);

    }
}
