package com.service.serviceImpl;

import com.pojo.Goods;
import com.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration(locations = {"classpath:spring-service.xml"})
public class GoodsServiceImplTest {
    @Autowired(required = true)
    private GoodsService goodsService;
    @Test
    public void getGoods() {
       Goods goods = goodsService.getGoods(1);
       System.out.println(goods.getGoodsName());
    }
}