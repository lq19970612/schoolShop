package com.service;

import com.pojo.Orders;

public interface OrdersService {
    public void addOrder (Orders orders);
    public Orders[] getOrdersByUserId(int userId);
    //查询未收货订单
    public Orders[] getNotTakeOverOrder(int userId);
    //查询已收货订单
    public Orders[]  getTakeOverOrder(int userId);
    //收货
    public void takeover(int orderId);
    //发货
    public void notTakeover(int orderId);
    public Orders[] getOrders(int userId);
}
