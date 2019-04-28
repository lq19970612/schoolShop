package com.service.serviceImpl;

import com.dao.OrderDetailsDao;
import com.pojo.Orderdetails;
import com.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired(required = true)
    @Qualifier("orderdetailsDao")
    private OrderDetailsDao orderDetailsDao;
    @Override
    public List<Orderdetails> getAllOrderDetails() {
        return orderDetailsDao.getAllOrderDetails();
    }

    @Override
    public List<Orderdetails> getOrderDetailsByOrderId(int orderId) {
        return orderDetailsDao.getOrderDetailsByOrderId(orderId);
    }

    @Override
    public Orderdetails getOrderDetails(int orderdetailsId) {
        return orderDetailsDao.getOrderDetails(orderdetailsId);
    }

    @Override
    public void addOrderDetails(Orderdetails orderdetails) {
        orderDetailsDao.addOrderDetails(orderdetails);
    }

    @Override
    public void addEvaluation(Orderdetails orderdetails) {
        orderDetailsDao.addEvaluation(orderdetails);
    }
}
