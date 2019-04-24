package com.controller;

import com.pojo.Shoppingcart;
import com.service.ShoppingcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
    @Autowired(required = true)
    private ShoppingcartService shoppingcartService;
    @RequestMapping(value="/selectShoppingcartByUserId",method= RequestMethod.POST)
    @ResponseBody
    public List<Shoppingcart> selectShoppingcartByUserId(@RequestParam(value = "userId",required = false) int userId){
        return shoppingcartService.selectShoppingcartByUserId(userId);
    }
    //添加商品至购物车
    @RequestMapping(value="/addGoodsToShoppingcart",method= RequestMethod.POST)
    @ResponseBody
    public void addGoodsToShoppingcart(@RequestParam(value = "userId" ,required = false)  int userId,
                                       @RequestParam(value = "goodsId" ,required = false)int goodsId,
                                       @RequestParam(value = "goodsNum" ,required = false)int goodsNum){
        Shoppingcart shoppingcart = new Shoppingcart();
        shoppingcart.setGoodsId(goodsId);
        shoppingcart.setGoodsNum(goodsNum);
        shoppingcart.setUserId(userId);
        shoppingcartService.addGoodsToShoppingcart(shoppingcart);
        System.out.println("已添加至购物车");
    }

    @RequestMapping(value="/deleteShopingCart",method= RequestMethod.POST)
    @ResponseBody
    public void  deleteShopingCart(@RequestParam(value="shoppingCartId",required = false)int shoppingCartId){
        shoppingcartService.deleteShopingCart(shoppingCartId);
        System.out.println("成功删除");
    }

}
