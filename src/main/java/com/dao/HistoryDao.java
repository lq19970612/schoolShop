package com.dao;

import com.pojo.History;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("historyDao")
public interface HistoryDao {
    //查看浏览记录
    public List<History> selectHistoryByUserId(int userId);
    //删除浏览记录
    public void deletHistory(int goodsId);
    //添加浏览记录
    public void addHistory(History history);
}
