package com.example.healthcarefordiabetes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_detail);

        Intent intent = getIntent();
        String diabetesName = intent.getStringExtra("name");
        String diabetesDescription = intent.getStringExtra("description");

        int diabetesImageRes = intent.getIntExtra("image", 0);

        ImageView coverImageView = findViewById(R.id.cover_image_view);
        coverImageView.setImageResource(diabetesImageRes);


        //TextView diabetesNameTextView = findViewById(R.id.in_name_text_view);
        //diabetesNameTextView.setText(diabetesName);

        TextView diabetesDescriptionTextView = findViewById(R.id.description_text_view);
        diabetesDescriptionTextView.setText(diabetesDescription);

    }
}
