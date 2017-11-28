package dao;

import pojo.User;

import java.util.List;

public interface UserDao {
    public User findUserById(int id) throws Exception;

    public List<User> findUserByUserName(String username) throws Exception;

    public void insertUser(User user) throws Exception;
}
