package com.example.mood;

import com.example.mood.model.Mood;
import com.example.mood.service.MoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MoodServiceTest {

    @Autowired
    MoodService moodService;

    @Test
    public void testFindMood() {
        List<Mood> moodList = moodService.findMood();
        for (Mood mood : moodList){
            System.out.println( mood);
        }

    }
}
