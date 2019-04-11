package com.pojo;


public class Shoppingcart {

  private long shoppingCartId;
  private long userId;
  private long goodsId;
  private long goodsNum;
  private Goods goods;

  public long getShoppingCartId() {
    return shoppingCartId;
  }

  public void setShoppingCartId(long shoppingCartId) {
    this.shoppingCartId = shoppingCartId;
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


  public long getGoodsNum() {
    return goodsNum;
  }

  public void setGoodsNum(long goodsNum) {
    this.goodsNum = goodsNum;
  }

  public Goods getGoods() {
    return goods;
  }

  public void setGoods(Goods goods) {
    this.goods = goods;
  }
}
