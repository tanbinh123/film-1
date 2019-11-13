package com.william.film.controller;

import com.william.film.mapper.SeatArrangementMapper;
import com.william.film.pojo.SeatArrangement;
import com.william.film.service.HistoryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HistoryOrderController {
    @Autowired
    HistoryOrderService historyOrderService;
    @RequestMapping("/history_order")
    @ResponseBody
    public List<SeatArrangement> historyOrders(HttpServletRequest request)throws Exception{
        int customerId = -1;
        Cookie[]cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies) {
                if(cookie.getName().equals("customerId")) {
                    customerId =Integer.parseInt(cookie.getValue());
                }
            }
        }
        if (customerId!=-1){
            //customerId意味着cookie中不存在customerId
            //查询所有订单
        }
        return historyOrderService.getHistoryOrder(customerId);
    }
}
