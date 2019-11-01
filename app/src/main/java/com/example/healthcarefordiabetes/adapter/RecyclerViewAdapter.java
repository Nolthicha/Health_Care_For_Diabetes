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

import com.example.healthcarefordiabetes.InDetailActivity;
import com.example.healthcarefordiabetes.R;
import com.example.healthcarefordiabetes.model.Diabetes;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mContext;
    private int mResource;
    private List<Diabetes> mDiabetesList;

    public RecyclerViewAdapter(Context mContext, int mResource, List<Diabetes> mDiabetesList) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mDiabetesList = mDiabetesList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Diabetes diabetes = mDiabetesList.get(position);

        holder.diabetes = diabetes;
        holder.nameTextView.setText(diabetes.name);
        //holder.descriptionTextView.setText(diabetes.description);
        holder.diabetesImageView.setImageResource(diabetes.imageRes);
    }

    @Override
    public int getItemCount() {
        return mDiabetesList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView diabetesImageView;
        private TextView nameTextView;
        private TextView descriptionTextView;

        private Diabetes diabetes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.diabetesImageView = itemView.findViewById(R.id.logo_image_view);
            this.nameTextView = itemView.findViewById(R.id.name_text_view);
            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, InDetailActivity.class);
                    intent.putExtra("name", diabetes.name);
                    intent.putExtra("image", diabetes.imageRes);
                    intent.putExtra("description",diabetes.description);
                    mContext.startActivity(intent);
                }
            });
        }
    }

}
