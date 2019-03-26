package com.service;

import com.pojo.History;

public interface HistoryService {
    //查看浏览记录
    public History getHistory(int userId);
    //删除浏览记录
    public void deletHistory(int historyId);
    //添加浏览记录
    public void addHistory(History history);
}
