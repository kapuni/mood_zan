package com.example.mood.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserMoodPraiseRel implements Serializable {
    private Integer id;
    private String userId;
    private String moodId;
}
