package com.dao;

import com.pojo.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ordersDao")
public interface OrdersDao {
    public void addOrder (Orders orders);
    public List<Orders> getOrdersByUserId(int userId);
    //查询未发货商品
    public List<Orders> getOrders(int userId);
    //查询未收货订单
    public List<Orders> getNotTakeOverOrder(int userId);
    //查询已收货订单
    public List<Orders>  getTakeOverOrder(int userId);
    //收货
    public void takeover(int orderId);
    //发货
    public void notTakeover(int orderId);
}
