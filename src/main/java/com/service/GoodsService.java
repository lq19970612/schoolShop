package com.service;

import com.pojo.Goods;

public interface GoodsService {
    public Goods getGoods(int goodsId);
    public void updateGoodsStock(int goodsId,int goodsNum);
}
