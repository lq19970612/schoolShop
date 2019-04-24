package com.controller;

import com.pojo.Favourites;
import com.service.FavouritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/favourites")
public class FavouritesController {
    @Autowired(required = true)
    private FavouritesService favouritesService;
    //取消收藏
    @RequestMapping(value="/deleteFavourite",method= RequestMethod.POST)
    @ResponseBody
    public void deleteFavourite(@RequestParam(value = "favouritesId",required = false) int favouritesId){
        favouritesService.deleteFavourite(favouritesId);
    }
    //收藏商品
    @RequestMapping(value="/addFavouriteGoods",method= RequestMethod.POST)
    @ResponseBody
    public void addFavouriteGoods(@RequestBody Favourites favourites){
        favouritesService.addFavouriteGoods(favourites);
    }
    //收藏店铺
    @RequestMapping(value="/addFavouriteStore",method= RequestMethod.POST)
    @ResponseBody
    public void addFavouriteStore(@RequestBody Favourites favourites){
        favouritesService.addFavouriteStore(favourites);
    }
    //查询商品收藏
    @RequestMapping(value="/getFavouriteGoods",method= RequestMethod.POST)
    @ResponseBody
    public List<Favourites> getFavouriteGoods(@RequestParam(value = "userId",required = false)int userId){
        return favouritesService.getFavouriteGoods(userId);
    }
    //查询店铺收藏
    @RequestMapping(value="/getFavouriteStore",method= RequestMethod.POST)
    @ResponseBody
    public List<Favourites> getFavouriteStore(@RequestParam(value = "userId",required = false)int userId){
        return favouritesService.getFavouriteStore(userId);
    }
}
