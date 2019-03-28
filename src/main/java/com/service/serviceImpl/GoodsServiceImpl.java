package com.service.serviceImpl;

import com.dao.GoodsDao;
import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Qualifier("goodsDao")
    @Autowired(required = true)
    private GoodsDao goodsDao;
    @Override
    public Goods getGoods(int goodsId) {
        return goodsDao.getGoods(goodsId);
    }

    @Override
    public void updateGoodsStock(int goodsId, int goodsNum) {
        goodsDao.updateGoodsStock(goodsId,goodsNum);
    }
}
