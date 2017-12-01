package test;


import edu.uestc.mybatis.mapper.OrdersMapper;
import edu.uestc.mybatis.po.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class testclass {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void createsqlSessionFactory() throws Exception {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void test5() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        try {
            Orders orders = mapper.selectByPrimaryKey(3);
            System.out.println("================");
            System.out.println(orders.getNumber());
            System.out.println("================");
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}
