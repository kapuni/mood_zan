package com.example.mood.dao;


import com.example.mood.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {
    User find(String id);
}
