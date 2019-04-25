package com.li.backoffice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("t1")
    public String test(){
        System.out.println("111");
        return "user/list";
    }
}
