package com.example.mood;

import com.example.mood.dao.UserDao;
import com.example.mood.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void testFind() {
        User user = userDao.find("1");
        System.out.println(user.getName());
    }
}
