package com.service;

import com.pojo.Orders;

import java.util.List;

public interface OrdersService {
    public void addOrder (Orders orders);
    public List<Orders> getOrdersByUserId(int userId);
    //查询未收货订单
    public List<Orders> getNotTakeOverOrder(int userId);
    //查询已收货订单
    public List<Orders>  getTakeOverOrder(int userId);
    //收货
    public void takeover(int orderId);
    //发货
    public void notTakeover(int orderId);
    public List<Orders> getOrders(int userId);
}
