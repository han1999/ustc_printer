package com.hanxiao.controller;

import com.hanxiao.bean.Order;
import com.hanxiao.vo.BaseRespVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @PostMapping("create")
    public BaseRespVo create(@RequestBody Order order) {
        System.out.println(order);
        return BaseRespVo.ok(order);
    }
}
