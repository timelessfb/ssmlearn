package dao;

import pojo.Orders;

public interface OrderDao {
    public Orders findOrderById(Integer id) throws Exception;
}
