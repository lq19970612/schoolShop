package com.service;

import com.pojo.Orderdetails;

import java.util.List;

public interface OrderDetailsService {
    public List<Orderdetails> getAllOrderDetails();
    public List<Orderdetails>  getOrderDetailsByOrderId(int orderId);
    public Orderdetails getOrderDetails(int orderdetailsId);
    public void addOrderDetails(Orderdetails orderdetails);
    public void addEvaluation(Orderdetails orderdetails);
}
