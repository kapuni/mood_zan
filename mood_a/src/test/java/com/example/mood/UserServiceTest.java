package com.example.mood;


import com.example.mood.model.User;
import com.example.mood.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testFind() {
        User user = userService.find("2");
        System.out.println(user.getName());
        System.out.println(user);
    }
}
