package com.example.healthcarefordiabetes.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
@Entity(tableName = "diary")

public class Diary {

    @PrimaryKey(autoGenerate = true)
    public int id;



    @ColumnInfo(name = "description")
    @SerializedName("description")
    public String description;

    @ColumnInfo(name = "date")
    @SerializedName("date")
    public String date;

    @ColumnInfo(name = "image")
    @SerializedName("image")
    public int imageRes;

    public Diary(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.imageRes = imageRes;
    }
}

