package com.hanxiao.ustc_printer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        System.out.println("now i am in demo!");
        return "hello, my friend";
    }
}
