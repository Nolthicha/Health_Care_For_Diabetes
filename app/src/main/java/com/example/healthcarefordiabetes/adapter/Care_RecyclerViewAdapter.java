package com.example.healthcarefordiabetes.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcarefordiabetes.InCareActivity;
import com.example.healthcarefordiabetes.R;
import com.example.healthcarefordiabetes.model.Care;

import java.util.List;

public class Care_RecyclerViewAdapter extends RecyclerView.Adapter<Care_RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private int mResource;
    private List<Care> mCareList;

    public Care_RecyclerViewAdapter(Context mContext, int mResource, List<Care> mCareList) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mCareList = mCareList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Care care = mCareList.get(position);

        holder.care = care;
        holder.nameTextView.setText(care.name);
        //holder.descriptionTextView.setText(diabetes.description);
        holder.careImageView.setImageResource(care.imageRes);
    }

    @Override
    public int getItemCount() {
        return mCareList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView careImageView;
        private TextView nameTextView;
        private TextView descriptionTextView;

        private Care care;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.careImageView = itemView.findViewById(R.id.logo_image_view);
            this.nameTextView = itemView.findViewById(R.id.description_text_view);
            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, InCareActivity.class);
                    intent.putExtra("name", care.name);
                    intent.putExtra("image", care.imageRes);
                    intent.putExtra("description",care.description);
                    mContext.startActivity(intent);
                }
            });
        }
    }

}
