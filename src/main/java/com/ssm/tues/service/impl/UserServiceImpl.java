package com.ssm.tues.service.impl;


import com.ssm.tues.mapper.UserMapper;
import com.ssm.tues.po.User;
import com.ssm.tues.po.UserExample;
import com.ssm.tues.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String username, String password) {

        List<User> user = new ArrayList<User>();
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        user = userMapper.selectByExample(userExample);
        if (user.size()==1){
        }
        return null;
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        if (user != null &&user.getPassword().equals(password)){
//            return user;
//        }
//        return null;
    }

}
