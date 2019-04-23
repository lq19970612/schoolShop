package com.pojo;


public class Orderdetails {

  private long orderdetailsId;
  private long goodsId;
  private long goodsNum;
  private long orderId;
  private long evaluation;
  private Goods goods;

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

  public long getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(long evaluation) {
    this.evaluation = evaluation;
  }

  public Goods getGoods() {
    return goods;
  }

  public void setGoods(Goods goods) {
    this.goods = goods;
  }
}
