package com.service.serviceImpl;

import com.dao.OrdersDao;
import com.pojo.Orders;
import com.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Autowired(required = true)
    @Qualifier("ordersDao")
    private OrdersDao ordersDao;
    @Override
    public void addOrder(Orders orders) {
        ordersDao.addOrder(orders);
        System.out.println("下单成功");
    }

    @Override
    public Orders[] getOrdersByUserId(int userId) {
        Orders[] orders = ordersDao.getOrdersByUserId(userId);
        return orders;
    }

    @Override
    public Orders[] getNotTakeOverOrder(int userId) {
        Orders[] orders = ordersDao.getNotTakeOverOrder(userId);
        return orders;
    }

    @Override
    public Orders[] getTakeOverOrder(int userId) {
        Orders[] orders = ordersDao.getTakeOverOrder(userId);
        return orders;
    }

    @Override
    public void takeover(int orderId) {
        ordersDao.takeover(orderId);
    }

    @Override
    public void notTakeover(int orderId) {
        ordersDao.notTakeover(orderId);
    }

    @Override
    public Orders[] getOrders(int userId) {
        Orders[] orders = ordersDao.getOrders(userId);
        return orders;
    }
}
