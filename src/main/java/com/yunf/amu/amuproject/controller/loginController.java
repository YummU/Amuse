package com.yunf.amu.amuproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@EnableAutoConfiguration
@Controller
@RequestMapping("/login")
public class loginController {

    @ResponseBody
    @RequestMapping(value = "/doLogin" , method = RequestMethod.POST)
    public String doLogin(){

        System.out.println("yes");
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }



}
