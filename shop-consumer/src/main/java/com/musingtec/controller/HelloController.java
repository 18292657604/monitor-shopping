package com.musingtec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LSY on 2018/8/29.
 */
@Controller
public class HelloController {

    @RequestMapping("/test")
    public String test(){
        return "/login";
    }
}
