package com.service.serviceImpl;

import com.dao.FavouritesDao;
import com.pojo.Favourites;
import com.service.FavouritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("favouritesService")
public class FavouritesServiceImpl implements FavouritesService {
    @Qualifier("favouritesDao")
    @Autowired(required = true)
    private FavouritesDao favouritesDao;
    @Override
    public void deleteFavourite(int favouritesId) {
        favouritesDao.deleteFavourite(favouritesId);
    }

    @Override
    public void addFavouriteGoods(Favourites favourites) {
        favouritesDao.addFavouriteGoods(favourites);
    }

    @Override
    public void addFavouriteStore(Favourites favourites) {
        favouritesDao.addFavouriteStore(favourites);
    }

    @Override
    public List<Favourites> getFavouriteGoods(int userId) {

        return favouritesDao.getFavouriteGoods(userId);
    }

    @Override
    public List<Favourites> getFavouriteStore(int userId) {
        return favouritesDao.getFavouriteStore(userId);
    }
}
