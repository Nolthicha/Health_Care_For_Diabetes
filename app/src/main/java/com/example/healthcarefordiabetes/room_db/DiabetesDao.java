package com.example.healthcarefordiabetes.room_db;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.healthcarefordiabetes.model.Diabetes;

import java.util.List;

@Dao
public interface DiabetesDao {

    @Query("SELECT * FROM diabetes")
    List<Diabetes> getAllDiabetes();



    @Insert
    void insertDiabetes(Diabetes diabetes);

}
