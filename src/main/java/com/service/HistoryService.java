package com.service;

import com.pojo.History;
import org.apache.ibatis.annotations.Param;

public interface HistoryService {
    //查看浏览记录
    public History[] selectHistoryByUserId(@Param(value="userId")int userId);
    //删除浏览记录
    public void deletHistory(int goodsId);
    //添加浏览记录
    public void addHistory(History history);
}
