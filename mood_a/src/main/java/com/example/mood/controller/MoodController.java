package com.example.mood.controller;

import com.example.mood.model.Mood;
import com.example.mood.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/mood")
public class MoodController {

    @Autowired
    private MoodService moodService;

    @RequestMapping("/test")
//    @ResponseBody
    public String moodTest(){
        return "This is a mood test.";
    }

    @RequestMapping(value = "/findAll")
    public String  findAll(Model model) {
        List<Mood> moodList = moodService.findAll();
        model.addAttribute("moods", moodList);
//        return moodList;
        return "main";
    }

//    @GetMapping(value = "/findMood")
//    public String findMood(Model model) {
//        List<Mood> moodList = moodService.findMood();
//        model.addAttribute("moods", moodList);
//        return "mood";
//    }

    @GetMapping(value = "/praise")
    public String praise(Model model, @RequestParam(value = "moodId") String moodId,
                         @RequestParam(value = "userId") String userId){
        boolean isPraise = moodService.praiseMood(userId,moodId);
        List<Mood> moodList = moodService.findAll();
        model.addAttribute("moods", moodList);
        model.addAttribute("isPraise", isPraise);
        return "main";
    }

//    @GetMapping(value = "/{moodId}/praiseForRedis")
//    public String praiseForRedis(Model model, @PathVariable(value = "moodId") String moodId,
//                                 @RequestParam(value = "userId") String userId) {
//        //方便使用，随机生成用户id
//        Random random = new Random();
//        userId = random.nextInt(100) + "";
//
//        boolean isPraise = moodService.praiseMoodForRedis(userId, moodId);
//        //查询所有的说说数据
//        List<MoodDTO> moodDTOList = moodService.findAllForRedis();
//        model.addAttribute("moods", moodDTOList);
//        model.addAttribute("isPraise", isPraise);
//        return "mood";
//    }
}