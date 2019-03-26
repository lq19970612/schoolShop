package com.service.serviceImpl;

import com.dao.HistoryDao;
import com.pojo.History;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration(locations = {"classpath:spring-*.xml"})
public class HisstoryServiceImplTest {
    @Autowired(required = true)
    private HistoryServiceImpl hisstoryService;
    @Test
    public void addHistory() {
        History history = new History();
        history.setGoodsId(1);
        history.setUserId(1);
        hisstoryService.addHistory(history);
    }
}