package com.example.healthcarefordiabetes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.healthcarefordiabetes.R;
import com.example.healthcarefordiabetes.model.Diabetes;

import java.util.List;

public class DiabetesListAdapter extends ArrayAdapter<Diabetes> {


    private Context mContext;
    private int mResource;
    private List<Diabetes> mDiabetesList;


    public DiabetesListAdapter(@NonNull Context context, int resource, @NonNull List<Diabetes> diabetesList) {
        super(context, resource, diabetesList);
        this.mContext = context;
        this.mResource = resource;
        this.mDiabetesList = diabetesList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // ทำการ Inflate layout
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = convertView;
        if (v == null) {
            v = inflater.inflate(mResource, parent, false);
        }

        // เข้าถึงออบเจ็ค Place ตาม position ที่ ListView ขอมา
        Diabetes diabetes = mDiabetesList.get(position);

        // กำหนดชื่อสถานที่ลงใน TextView (place_name_text_view)
        TextView diabetesNameTextView = v.findViewById(R.id.description_text_view);
        diabetesNameTextView.setText(diabetes.name);

        // กำหนดชื่ออำเภอลงใน TextView (district_text_view)
        //TextView districtTextView = v.findViewById(R.id.description_text_view);
        //districtTextView.setText("อำเภอ".concat(diabetes.description));

        ImageView logoImageView = v.findViewById(R.id.logo_image_view);
        logoImageView.setImageResource(diabetes.imageRes);

        return v;
    }
}








