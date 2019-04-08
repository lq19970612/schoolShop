package com.controller;

import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @RequestMapping(value="/getGoods",method= RequestMethod.POST)
    @ResponseBody
    public Goods getGoods(@RequestBody int goodsId){
        return goodsService.getGoods(goodsId);
    }


}
