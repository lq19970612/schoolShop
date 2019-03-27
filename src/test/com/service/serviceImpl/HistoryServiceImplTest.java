package com.service.serviceImpl;

import com.pojo.History;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration(locations = {"classpath:spring-service.xml"})
public class HistoryServiceImplTest {
    @Autowired(required = true)
    private HistoryServiceImpl historyService;
    @Test
    public void addHistory() {
        History history = new History();
        history.setGoodsId(1);
        history.setUserId(1);
        historyService.addHistory(history);
    }
}