package com.revosith.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2017-06-14
 * @Author 左轮
 * @Desc
 */
@RestController
public class Hello {

    @RequestMapping(value= "/hello")
    @ResponseBody
    public String sayHello(@RequestParam("name")String name){
        return "Hello "+name;
    }
}