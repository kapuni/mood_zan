package com.example.mood.service.impl;



import com.example.mood.dao.UserDao;
import com.example.mood.model.User;
import com.example.mood.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User find(String id) {
        User user = userDao.find(id);
        return user;
    }

//    private UserDTO converModel2DTO(User user) {
//        UserDTO userDTO = new UserDTO();
//        userDTO.setId(user.getId());
//        userDTO.setAccount(user.getAccount());
//        userDTO.setName(user.getName());
//        return userDTO;
//    }
}
