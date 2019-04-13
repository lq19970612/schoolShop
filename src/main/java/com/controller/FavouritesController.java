package com.controller;

import com.pojo.Favourites;
import com.service.FavouritesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/favourites")
public class FavouritesController {
    @Resource
    private FavouritesService favouritesService;
    //取消收藏
    @RequestMapping(value="/deleteFavourite",method= RequestMethod.POST)
    @ResponseBody
    public void deleteFavourite(@RequestParam int favouritesId){
        favouritesService.deleteFavourite(favouritesId);
    }
    //收藏商品
    @RequestMapping(value="/addFavouriteGoods",method= RequestMethod.POST)
    @ResponseBody
    public void addFavouriteGoods(Favourites favourites){
        favouritesService.addFavouriteGoods(favourites);
    }
    //收藏店铺
    @RequestMapping(value="/addFavouriteStore",method= RequestMethod.POST)
    @ResponseBody
    public void addFavouriteStore(Favourites favourites){
        favouritesService.addFavouriteStore(favourites);
    }
    //查询商品收藏
    @RequestMapping(value="/getFavouriteGoods",method= RequestMethod.POST)
    @ResponseBody
    public List<Favourites> getFavouriteGoods(int userId){
        return favouritesService.getFavouriteGoods(userId);
    }
    //查询店铺收藏
    @RequestMapping(value="/getFavouriteStore",method= RequestMethod.POST)
    @ResponseBody
    public List<Favourites> getFavouriteStore(int userId){
        return favouritesService.getFavouriteStore(userId);
    }
}
