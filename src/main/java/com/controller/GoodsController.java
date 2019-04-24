package com.controller;

import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired(required = true)
    private GoodsService goodsService;
    @RequestMapping(value="/getGoods",method= RequestMethod.POST)
    @ResponseBody
    public Goods getGoods(@RequestParam(value = "goodsId",required = false) int goodsId){
        return goodsService.getGoods(goodsId);
    }


}
