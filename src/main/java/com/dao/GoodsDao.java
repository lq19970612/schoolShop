package com.dao;

import com.pojo.Goods;
import org.springframework.stereotype.Repository;

@Repository("goodsDao")
public interface GoodsDao {
    public Goods getGoods(int goodsId);
}
