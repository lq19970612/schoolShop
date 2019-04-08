package com.service.serviceImpl;

import com.dao.HistoryDao;
import com.pojo.History;
import com.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {

    @Autowired(required = true)
    @Qualifier("historyDao")
    private HistoryDao historyDao;
    @Override
    public History[] selectHistoryByUserId(int userId) {
        History[] histories = historyDao.selectHistoryByUserId(userId);
        return histories;
    }

    @Override
    public void deletHistory(int goodsId) {
        historyDao.deletHistory(goodsId);
        System.out.println("删除成功");
    }

    @Override
    public void addHistory(History history) {
        historyDao.addHistory(history);
        System.out.println("添加成功");

    }
}
