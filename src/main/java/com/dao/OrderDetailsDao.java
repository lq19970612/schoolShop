package com.dao;

import com.pojo.Orderdetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderdetailsDao")
public interface OrderDetailsDao {
    public List<Orderdetails> getAllOrderDetails();
    public List<Orderdetails>  getOrderDetailsByOrderId(int orderId);
    public Orderdetails getOrderDetails(int orderdetailsId);
    public void addOrderDetails(Orderdetails orderdetails);
    public void addEvaluation(Orderdetails orderdetails);
}
