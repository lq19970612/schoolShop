package com.service.serviceImpl;

import com.dao.HistoryDao;
import com.pojo.History;
import com.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {
    @Autowired(required = true)
    private HistoryDao historyDao;
    @Override
    public History getHistory(int userId) {
        return historyDao.getHistory(userId);
    }

    @Override
    public void deletHistory(int historyId) {
        historyDao.deletHistory(historyId);
        System.out.println("删除成功");
    }

    @Override
    public void addHistory(History history) {
        historyDao.addHistory(history);
        System.out.println("添加成功");

    }
}
