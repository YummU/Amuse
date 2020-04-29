package com.yunf.amu.amuproject.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@EnableAutoConfiguration
@Controller
@RequestMapping("/login")
public class loginController {

    @RequestMapping("/do")
    public String doLogin(){
        return "index";
    }

}
