package edu.uestc.spring.ioc;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements UserService {

    public void findUserById(Integer id) throws Exception {
        System.out.println("hello world");
    }
}
