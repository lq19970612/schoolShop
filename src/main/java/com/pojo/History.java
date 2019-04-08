package com.pojo;


public class History {

  private long historyId;
  private long userId;
  private long goodsId;
  private java.sql.Timestamp historyDate;
  private  Goods goods;


  public long getHistoryId() {
    return historyId;
  }

  public void setHistoryId(long historyId) {
    this.historyId = historyId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public java.sql.Timestamp getHistoryDate() {
    return historyDate;
  }

  public void setHistoryDate(java.sql.Timestamp historyDate) {
    this.historyDate = historyDate;
  }

  public Goods getGoods() {
    return goods;
  }

  public void setGoods(Goods goods) {
    this.goods = goods;
  }
}
