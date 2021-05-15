package com.example.mood.dao;

import com.example.mood.model.UserMoodPraiseRel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMoodPraiseRelDao {
    boolean save(@Param("userMoodPraiseRel") UserMoodPraiseRel userMoodPraiseRel);

}
