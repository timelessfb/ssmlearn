package dao;

import pojo.User;

import java.util.List;

public interface o2mDao {
    List<User> findAllUserWithOrders() throws Exception;
}
