package test;

import dao.OrderDao;
import dao.UserDao;
import dao.UserOrderDao;
import dao.o2mDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import pojo.Orders;
import pojo.User;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class testclass {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void createsqlSessionFactory() throws Exception {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            User user = sqlSession.selectOne("test.findUserById", 10);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testfindUserByUserName() {
        SqlSession sqlSession = null;
        sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("test.findUserByUserName", "王");
        sqlSession.close();
    }

    @Test
    public void testinsertUser() {
        SqlSession sqlSession = null;
        sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setAddress("安阳");
        user.setBirthday(new Date());
        user.setSex("1");
        user.setUsername("冯波");
        user.setId(1001);
        sqlSession.insert("test.insertUser", user);

        sqlSession.commit();
        System.out.println(user.getId());
        sqlSession.close();
    }

    @Test
    public void testdeleteUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteUserById", 32);
        sqlSession.delete("test.deleteUserById", 33);
        sqlSession.delete("test.deleteUserById", 34);
        sqlSession.delete("test.deleteUserById", 35);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testupdateUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(16);
        user.setUsername("刘宁");
        user.setSex("2");
        user.setBirthday(new Date(1994, 3, 9));
        sqlSession.update("test.updateUser", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdm() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = null;
        try {
            userById = mapper.findUserById(37);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(userById);
        sqlSession.close();
    }

    @Test
    public void test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("三");
//        user.setSex("1");
        try {
            List<User> userList = mapper.findUserList(user);
            System.out.println(userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSession.close();
    }


    @Test
    public void test2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        try {
            Orders orderById = mapper.findOrderById(3);
            System.out.println(orderById);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserOrderDao mapper = sqlSession.getMapper(UserOrderDao.class);
        try {
            List<Orders> orderList = mapper.findOrderList();
            System.out.println(orderList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSession.close();
    }

    @Test
    public void test4() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        o2mDao mapper = sqlSession.getMapper(o2mDao.class);
        try {
            List<User> allUserWithOrders = mapper.findAllUserWithOrders();
            System.out.println(allUserWithOrders);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSession.close();
    }

    @Test
    public void test5() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        o2mDao mapper = sqlSession.getMapper(o2mDao.class);
        try {
            List<User> allUserWithOrders = mapper.findAllUserWithOrders();
            System.out.println(allUserWithOrders);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSession.close();
    }

}
