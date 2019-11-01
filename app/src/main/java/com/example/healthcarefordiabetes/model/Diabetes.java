package com.example.healthcarefordiabetes.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
@Entity(tableName = "diabetes")

public class Diabetes {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    @SerializedName("name")
    public String name;

    @ColumnInfo(name = "description")
    @SerializedName("description")
    public String description;

    @ColumnInfo(name = "image")
    @SerializedName("image")
    public int imageRes;

    public Diabetes(int id, String name, String description, int imageRes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageRes = imageRes;
    }
}

