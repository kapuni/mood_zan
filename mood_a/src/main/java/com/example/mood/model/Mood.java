package com.example.mood.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Mood implements Serializable {
    private String id;
    private String content;
    private Integer praiseNum;
    private String userId;
    private Date publishTime;
}
