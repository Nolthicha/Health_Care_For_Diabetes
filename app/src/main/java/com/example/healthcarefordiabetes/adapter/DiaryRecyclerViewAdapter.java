package com.example.healthcarefordiabetes.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcarefordiabetes.InsertDiaryActivity;
import com.example.healthcarefordiabetes.R;
import com.example.healthcarefordiabetes.model.Diary;

import java.util.List;

public class DiaryRecyclerViewAdapter extends RecyclerView.Adapter<DiaryRecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private int mResource;
    private List<Diary> mDiaryList;

    public DiaryRecyclerViewAdapter(Context mContext, int mResource, List<Diary> mDiaryList) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mDiaryList = mDiaryList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiaryRecyclerViewAdapter.MyViewHolder holder, int position) {
        Diary diary = mDiaryList.get(position);

        holder.diary = diary;
        holder.descriptionTextView.setText(diary.description);
        holder.dateTextView.setText(diary.date);
        //holder.dateTextView.setImageResource(diary.imageRes);
    }

    @Override
    public int getItemCount() {
        return mDiaryList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        //private ImageView diaryImageView;

        private TextView descriptionTextView;
        private TextView dateTextView;

        private Diary diary;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //this.diaryImageView = itemView.findViewById(R.id.logo_image_view);

            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);
            this.dateTextView = itemView.findViewById(R.id.date_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, InsertDiaryActivity.class);
                    intent.putExtra("description", diary.description);
                    //intent.putExtra("image", diary.imageRes);
                   intent.putExtra("date",diary.date);
                    mContext.startActivity(intent);
                }
            });
        }
    }

}
