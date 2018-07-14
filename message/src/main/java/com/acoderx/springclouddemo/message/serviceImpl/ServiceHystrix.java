package com.acoderx.springclouddemo.message.serviceImpl;

import org.springframework.stereotype.Component;

/**
 * Created by xudi on 2018/4/19.
 */
@Component
public class ServiceHystrix implements InvokeServiceFeignImpl {
    @Override
    public String getUserInfo() {
        return "hystrix";
    }

    @Override
    public String getUserInfo2() {
        return "hystrix2";
    }
}
