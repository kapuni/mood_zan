package com.example.mood.service.impl;




import com.example.mood.dao.UserMoodPraiseRelDao;
import com.example.mood.model.UserMoodPraiseRel;
import com.example.mood.service.UserMoodPraiseRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserMoodPraiseRelServiceImpl implements UserMoodPraiseRelService {

    @Resource
    private UserMoodPraiseRelDao userMoodPraiseRelDao;

    @Override
    public boolean save(UserMoodPraiseRel userMoodPraiseRel) {
        return userMoodPraiseRelDao.save(userMoodPraiseRel);
    }
}
