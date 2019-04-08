package com.pojo;


import java.util.List;

public class Orders {

  private long orderId;
  private long userId;
  private long addressId;
  private String orderStatus;
  private List<Orderdetails> orderdetailsList;

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public List<Orderdetails> getOrderdetailsList() {
    return orderdetailsList;
  }

  public void setOrderdetailsList(List<Orderdetails> orderdetailsList) {
    this.orderdetailsList = orderdetailsList;
  }

  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }
}
