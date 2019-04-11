package com.pojo;


public class Favourites {

  private long favouritesId;
  private long userId;
  private long goodsId;
  private long storeId;
  private Goods goods;



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


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }

  public Goods getGoods() {
    return goods;
  }

  public void setGoods(Goods goods) {
    this.goods = goods;
  }

  public long getFavouritesId() {
    return favouritesId;
  }

  public void setFavouritesId(long favouritesId) {
    this.favouritesId = favouritesId;
  }
}
