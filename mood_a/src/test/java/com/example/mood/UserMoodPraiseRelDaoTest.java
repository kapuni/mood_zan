package com.example.mood;


import com.example.mood.dao.UserMoodPraiseRelDao;
import com.example.mood.model.UserMoodPraiseRel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMoodPraiseRelDaoTest {

    @Autowired
    UserMoodPraiseRelDao userMoodPraiseRelDao;



    @Test
    public void testSave() {
        UserMoodPraiseRel userMoodPraiseRel;
//        userMoodPraiseRel.getMoodId("1");

//        boolean state = userMoodPraiseRelDao.save();
        System.out.println("ok");
    }
}
