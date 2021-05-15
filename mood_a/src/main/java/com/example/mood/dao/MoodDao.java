package com.example.mood.dao;


import com.example.mood.model.Mood;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface MoodDao {
    List<Mood> findAll();
    Mood findById(String id);
    boolean update(@Param("mood") Mood mood);
}
