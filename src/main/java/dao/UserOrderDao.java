package dao;

import pojo.Orders;

import java.util.List;

public interface UserOrderDao {
    List<Orders> findOrderList()throws Exception;
}
