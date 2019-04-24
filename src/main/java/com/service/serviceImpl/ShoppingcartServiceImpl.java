package com.service.serviceImpl;

import com.dao.ShoppingcartDao;
import com.pojo.Shoppingcart;
import com.service.ShoppingcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shoppingcartService")
public class ShoppingcartServiceImpl implements ShoppingcartService {
    @Autowired(required = true)
    @Qualifier("shoppingcartDao")
    private ShoppingcartDao shoppingcartDao;
    @Override
    public void addGoodsToShoppingcart(Shoppingcart shoppingcart) {
        shoppingcartDao.addGoodsToShoppingcart(shoppingcart);
    }

    @Override
    public List<Shoppingcart> selectShoppingcartByUserId(int userId) {
        List<Shoppingcart> list = shoppingcartDao.selectShoppingcartByUserId(userId);
        return list;
    }

    @Override
    public void deleteShopingCart(int shoppingCartId) {
        shoppingcartDao.deleteShopingCart(shoppingCartId);
    }
}
