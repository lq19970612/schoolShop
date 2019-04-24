package com.service;

import com.pojo.History;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryService {
    //查看浏览记录
    public List<History> selectHistoryByUserId(int userId);
    //删除浏览记录
    public void deletHistory(int goodsId);
    //添加浏览记录
    public void addHistory(History history);
}
