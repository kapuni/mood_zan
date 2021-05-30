package com.example.mood.service.impl;



import com.example.mood.dao.MoodDao;
import com.example.mood.dao.UserDao;
import com.example.mood.dao.UserMoodPraiseRelDao;
import com.example.mood.model.Mood;
import com.example.mood.model.UserMoodPraiseRel;
import com.example.mood.service.MoodService;
import com.example.mood.service.UserService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class MoodSericeImpl implements MoodService {

    @Resource
    private MoodDao moodDao;

    @Resource
    private UserDao userDao;

    @Resource
    private UserMoodPraiseRelDao userMoodPraiseRelDao;

    @Override
    public List<Mood> findAll(){
        List<Mood> moodList = moodDao.findAll();
        return moodList;
    }

//    private List<MoodDTO> converModel2DTO(List<Mood> moodList) {
//        if (CollectionUtils.isEmpty(moodList)){
//            return Collections.EMPTY_LIST;
//        }
//        List<MoodDTO> moodDTOList = new ArrayList<MoodDTO>();
//        for (Mood mood:moodList){
//            MoodDTO moodDTO = new MoodDTO();
//            moodDTO.setId(mood.getId());
//            moodDTO.setContent(mood.getContent());
//            moodDTO.setPraiseNum(mood.getPraiseNum());
//            moodDTO.setPublishTime(mood.getPublishTime());
//            moodDTO.setUserId(mood.getUserId());
//            User user = userDao.find(mood.getUserId());
//            moodDTO.setUserName(user.getName());
//            moodDTO.setUserAccount(user.getAccount());
//            moodDTOList.add(moodDTO);
//
//        }
//        return moodDTOList;
//    }

    @Override
    public List<Mood> findMood() {
        List<Mood> moodList = moodDao.findAll();
        return moodList;
    }

    @Override
    public boolean praiseMood(String userId, String moodID) {
        UserMoodPraiseRel userMoodPraiseRel = new UserMoodPraiseRel();
        userMoodPraiseRel.setUserId(userId);
        userMoodPraiseRel.setMoodId(moodID);
        userMoodPraiseRelDao.save(userMoodPraiseRel);
        Mood mood = this.findById(moodID);
        mood.setPraiseNum(mood.getPraiseNum()+1);
        this.update(mood);
        return Boolean.TRUE;
    }

    @Override
    public boolean update(Mood mood) {
        return moodDao.update(mood);
    }

    @Override
    public Mood findById(String id) {
        return moodDao.findById(id);
    }

    @Resource
    private RedisTemplate redisTemplate;
    private static final String PRAISE_HASH_KEY = "springmvc.mybatis.boot.mood.id.list.key";
//    @Resource
//    private MoodProducer moodProducer;
//    private static Destination destination = new ActiveMQQueue("ke.queue.high.concurrency.praise");
    @Override
    public boolean praiseMoodForRedis(String userId, String moodId) {

        redisTemplate.opsForValue().set(PRAISE_HASH_KEY,moodId);
        redisTemplate.opsForValue().set(moodId,userId);
        return false;
//        mq
//        Mood mood = new Mood();
//        mood.setId(userId);
//        mood.setUserId(userId);
//        moodProducer.sendMessage(destination,moodDTO);

    }

    @Resource
    private UserService userService;
    @Override
    public List<Mood> findAllForRedis() {
        List<Mood> moodList = moodDao.findAll();
        if (CollectionUtils.isEmpty(moodList)){
            return Collections.EMPTY_LIST;
        }

        return moodList;
    }
}
