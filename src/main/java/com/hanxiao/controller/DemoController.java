package com.hanxiao.controller;

import com.hanxiao.vo.BaseRespVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        System.out.println("now i am in demo!");
        return "hello, my friend";
    }

    @GetMapping("test")
    public BaseRespVo test(){
        return BaseRespVo.ok();
    }
}
