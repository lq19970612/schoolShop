package com.dao;

import com.pojo.Orders;
import org.springframework.stereotype.Repository;

@Repository("ordersDao")
public interface OrdersDao {
    public void addOrder (Orders orders);
    public Orders[] getOrdersByUserId(int userId);
    //查询未发货商品
    public Orders[] getOrders(int userId);
    //查询未收货订单
    public Orders[] getNotTakeOverOrder(int userId);
    //查询已收货订单
    public Orders[]  getTakeOverOrder(int userId);
    //收货
    public void takeover(int orderId);
    //发货
    public void notTakeover(int orderId);
}
