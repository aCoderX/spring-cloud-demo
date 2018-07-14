package com.acoderx.springclouddemo.message.controller;

import com.acoderx.springclouddemo.message.service.InvokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xudi on 2018/4/18.
 */
@RestController
public class TestController {
    @Autowired
    @Qualifier("invokeServiceRibbonImpl")
    private InvokeService invokeService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return invokeService.getUserInfo();
    }
    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String test2(){
        return invokeService.getUserInfo2();
    }
}
