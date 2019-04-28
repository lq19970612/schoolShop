package com.service.serviceImpl;

import com.pojo.History;
import com.service.HistoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration(locations = {"classpath:spring-service.xml"})
public class HistoryServiceImplTest {
    @Autowired(required = true)
    private HistoryService historyService;
    @Test
    public void addHistory() {
        History history = new History();
        history.setGoodsId(1);
        history.setUserId(1);
        historyService.addHistory(history);
    }

    @Test
    public void selectHistoryByUserId(){
        int user_Id=1;
        List<History> histories = historyService.selectHistoryByUserId(user_Id);
        System.out.println(histories);
        for(History history :histories){
            System.out.println("HistoryId:"+history.getHistoryId()+"  UserId:"+history.getUserId()+"  GoodsId:"+history.getGoodsId()+"  GoodsName:"+history.getGoods().getGoodsName()+"  HistoryDate:"+history.getHistoryDate());
        }
    }
}