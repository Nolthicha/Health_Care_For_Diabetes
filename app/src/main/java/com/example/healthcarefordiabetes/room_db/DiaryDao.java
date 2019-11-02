package com.example.healthcarefordiabetes.room_db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.healthcarefordiabetes.model.Diary;

import java.util.List;

@Dao
public interface DiaryDao {



    @Query("SELECT * FROM diary")
    List<Diary> getAll();

    @Insert
    void insert(Diary diary);

}
