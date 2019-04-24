package com.service.serviceImpl;

import com.dao.OrdersDao;
import com.pojo.Orders;
import com.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Orders> getOrdersByUserId(int userId) {
        List<Orders> orders = ordersDao.getOrdersByUserId(userId);
        return orders;
    }

    @Override
    public List<Orders> getNotTakeOverOrder(int userId) {
        List<Orders> orders = ordersDao.getNotTakeOverOrder(userId);
        return orders;
    }

    @Override
    public List<Orders> getTakeOverOrder(int userId) {
        List<Orders> orders = ordersDao.getTakeOverOrder(userId);
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
    public List<Orders> getOrders(int userId) {
        List<Orders> orders = ordersDao.getOrders(userId);
        return orders;
    }
}
