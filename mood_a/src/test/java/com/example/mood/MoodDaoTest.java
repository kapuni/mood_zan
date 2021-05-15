package com.example.mood;


import com.example.mood.dao.MoodDao;
import com.example.mood.model.Mood;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoodDaoTest {

    @Resource
    MoodDao moodDao;

    @Test
    public void testFindAll(){
        List<Mood> moodList = moodDao.findAll();
        System.out.println(moodList.size());
    }

//    public void testUpdate(){
//        Mood mood;
//        mood
//    }
}
