package com.dao;

import com.pojo.Favourites;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("favouritesDao")
public interface FavouritesDao {
    //取消收藏
    public void deleteFavourite(int favouritesId);
    //收藏商品
    public void addFavouriteGoods(Favourites favourites);
    //收藏店铺
    public void addFavouriteStore(Favourites favourites);
    //查询商品收藏
    public List<Favourites> getFavouriteGoods(int favouritesId);
    //查询店铺收藏
    public List<Favourites> getFavouriteStore(int favouritesId);
}
