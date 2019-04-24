package com.controller;

import com.pojo.Orderdetails;
import com.pojo.Orders;
import com.pojo.Shoppingcart;
import com.service.GoodsService;
import com.service.OrderDetailsService;
import com.service.OrdersService;
import com.service.ShoppingcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired(required = true)
    private OrdersService ordersService;
    @Autowired(required = true)
    private OrderDetailsService orderDetailsService;
    @Autowired(required = true)
    private ShoppingcartService shoppingcartService;
    @Autowired(required = true)
    private GoodsService goodsService;
    //下单
    @RequestMapping(value="/addOrder",method= RequestMethod.POST)
    @ResponseBody
    public void addOrder(){

    }
    @RequestMapping(value="/getOrdersByUserId",method= RequestMethod.POST)
    @ResponseBody
    public List<Orders> getOrdersByUserId (@RequestParam(value = "userId",required = false) int userId){
        List<Orders> ordersList =  ordersService.getOrdersByUserId(userId);
        for (Orders  o :ordersList){
            List<Orderdetails> orderdetailsList = orderDetailsService.getOrderDetailsByOrderId((int) o.getOrderId());
            for (Orderdetails orderdetails:orderdetailsList){
                orderdetails.setGoods(goodsService.getGoods((int) orderdetails.getGoodsId()));
            }
            o.setOrderdetailsList(orderdetailsList);
        }
        return ordersList;
    }
    //收货
    @RequestMapping(value="/takeover",method= RequestMethod.POST)
    @ResponseBody
    public void takeover(@RequestParam(value = "orderId",required = false)int orderId){
        ordersService.takeover(orderId);
        System.out.println("收货成功");
    }

    //发货
    @RequestMapping(value="/nottakeover",method= RequestMethod.POST)
    @ResponseBody
    public void nottakeover(@RequestParam(value = "orderId",required = false)int orderId){
        ordersService.notTakeover(orderId);
        System.out.println("发货成功");
    }

    //获取已收货订单信息
    @RequestMapping(value="/getTakeOverOrder",method= RequestMethod.POST)
    @ResponseBody
    public List<Orders> getTakeOverOrder (@RequestParam(value = "userId",required = false) int userId){
        List<Orders> ordersList = ordersService.getTakeOverOrder(userId);
        for (Orders  o :ordersList){
            List<Orderdetails> orderdetailsList = orderDetailsService.getOrderDetailsByOrderId((int) o.getOrderId());
            for (Orderdetails orderdetails:orderdetailsList){
                orderdetails.setGoods(goodsService.getGoods((int) orderdetails.getGoodsId()));
            }
            o.setOrderdetailsList(orderdetailsList);
        }
        return ordersList;

    }
    //获取已发货订单
    @RequestMapping(value="/getNotTakeOverOrder",method= RequestMethod.POST)
    @ResponseBody
    public List<Orders>  getNotTakeOverOrder(@RequestParam(value = "userId",required = false) int userId){
        List<Orders> ordersList =  ordersService.getNotTakeOverOrder(userId);
        for (Orders  o :ordersList){
            List<Orderdetails> orderdetailsList = orderDetailsService.getOrderDetailsByOrderId((int) o.getOrderId());
            for (Orderdetails orderdetails:orderdetailsList){
                orderdetails.setGoods(goodsService.getGoods((int) orderdetails.getGoodsId()));
            }
            o.setOrderdetailsList(orderdetailsList);
        }
        return ordersList;
    }
}
