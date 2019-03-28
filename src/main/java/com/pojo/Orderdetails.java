package com.pojo;


public class Orderdetails {

  private long orderdetailsId;
  private long goodsId;
  private long goodsNum;
  private long orderId;


  public long getOrderdetailsId() {
    return orderdetailsId;
  }

  public void setOrderdetailsId(long orderdetailsId) {
    this.orderdetailsId = orderdetailsId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getGoodsNum() {
    return goodsNum;
  }

  public void setGoodsNum(long goodsNum) {
    this.goodsNum = goodsNum;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

}
