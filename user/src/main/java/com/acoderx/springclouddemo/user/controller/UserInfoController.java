package com.acoderx.springclouddemo.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xudi on 2018/4/18.
 */
@RestController
public class UserInfoController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String info(){
        return "xd";
    }
}
