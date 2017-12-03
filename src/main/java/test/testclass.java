package test;


import edu.uestc.mybatis.mapper.OrdersMapper;
import edu.uestc.mybatis.po.Orders;
import edu.uestc.service.CDPlayer;
import edu.uestc.service.UserService;
import edu.uestc.service.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServerConfig.class)
public class testclass {

    @Autowired
    CDPlayer cdPlayer;

    @Test
    public void test6() {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            cdPlayer.callfun();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


