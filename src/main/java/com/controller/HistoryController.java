package com.controller;

import com.pojo.History;
import com.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/history")
public class HistoryController {
    @Autowired(required = true)
    private HistoryService historyService;

    @RequestMapping(value="/addHistory",method= RequestMethod.POST)
    @ResponseBody
    public void addHistory(@RequestBody History history){
        historyService.addHistory(history);
        System.out.println("历史记录添加成功");
    }
    @RequestMapping(value="/selectHistoryByUserId",method= RequestMethod.POST)
    @ResponseBody
    public History[] selectHistoryByUserId(@RequestParam(value = "userId",required = false)int userId){
        History[] histories = historyService.selectHistoryByUserId(userId);
        return histories;
    }
    @RequestMapping(value="/deletHistory",method= RequestMethod.POST)
    @ResponseBody
    public void deletHistory(@RequestParam(value = "goodsId",required = false) int goodsId){
        historyService.deletHistory(goodsId);
        System.out.println("浏览记录删除成功");
    }

}
