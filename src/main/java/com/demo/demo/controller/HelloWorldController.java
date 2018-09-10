package com.demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐旺
 * @ClassName:
 * @ClassNameExplain: 类名说明
 * @Description: (这里描述这个类的作用)
 * @date
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String index(){
        return "hello world";
    }
}
