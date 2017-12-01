package edu.uestc.service;

import edu.uestc.mybatis.mapper.UserMapper;

public class UserServiceImpl implements UserService{
    public void findUserById(Integer id) throws Exception {
        System.out.println(id);
    }
}
