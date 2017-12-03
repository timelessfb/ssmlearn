package edu.uestc.service;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Properties;


@Component
public class UserServiceImpl implements UserService {

    public void findUserById(Integer id) throws Exception {
        System.out.println("hello world");
    }
}
