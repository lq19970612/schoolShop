package com.service;

import com.pojo.Favourites;

import java.util.List;

public interface FavouritesService {
    //取消收藏
    public void deleteFavourite(int favouritesId);
    //收藏商品
    public void addFavouriteGoods(Favourites favourites);
    //收藏店铺
    public void addFavouriteStore(Favourites favourites);
    //查询商品收藏
    public List<Favourites> getFavouriteGoods(int userId);
    //查询店铺收藏
    public List<Favourites> getFavouriteStore(int userId);
}
