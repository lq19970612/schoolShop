package com.dao;

import com.pojo.Shoppingcart;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("shoppingcartDao")
public interface ShoppingcartDao {
    public void addGoodsToShoppingcart(Shoppingcart shoppingcart);
    public List<Shoppingcart> selectShoppingcartByUserId(int userId);
    public void  deleteShopingCart(int shoppingCartId);
}
