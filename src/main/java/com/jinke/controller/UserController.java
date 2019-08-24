package com.jinke.controller;

import com.jinke.domain.User;
import com.jinke.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@CrossOrigin
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryList() {
        List<User> users = userMapper.queryList();
        return users;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public User findById(int id) {
        User user = userMapper.findById(id);
        return user;
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
