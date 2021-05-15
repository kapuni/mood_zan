package com.example.mood.service;


import com.example.mood.dao.MoodDao;
import com.example.mood.model.Mood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MoodService {
    List<Mood> findAll();
    List<Mood> findMood();
    boolean praiseMood(String userId,String moodID);
    boolean update(@Param("mood") Mood mood);
    Mood findById(String id);

//    boolean praiseMoodForRedis(String userId,String moodId);
//    List<MoodDao> findAllForRedis();
}
