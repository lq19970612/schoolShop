package com.dao;

import com.pojo.Goods;
import org.springframework.stereotype.Repository;

@Repository("goodsDao")
public interface GoodsDao {
    //查询商品信息
    public Goods getGoods(int goodsId);
    //更新商品库存
    public void updateGoodsStock(int goodsId,int goodsNum);
}
