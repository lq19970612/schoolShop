package com.service;

import com.pojo.Shoppingcart;

import java.util.List;

public interface ShoppingcartService {
    public void addGoodsToShoppingcart(Shoppingcart shoppingcart);
    public List<Shoppingcart> selectShoppingcartByUserId(int userId);
    public void  deleteShopingCart(int shoppingCartId);
}
