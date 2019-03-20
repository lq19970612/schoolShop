package com.dao;

import com.pojo.History;
import org.springframework.stereotype.Repository;

@Repository("historyDao")
public interface HistoryDao {
    //查看浏览记录
    public History getHistory(int userId);
    //删除浏览记录
    public void deletHistory(int historyId);
    //添加浏览记录
    public void addHistory(History history);
}
