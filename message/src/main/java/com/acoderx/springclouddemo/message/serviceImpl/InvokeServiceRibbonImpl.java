package com.acoderx.springclouddemo.message.serviceImpl;

import com.acoderx.springclouddemo.message.service.InvokeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xudi on 2018/4/18.
 */
@Service
public class InvokeServiceRibbonImpl implements InvokeService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "userInfoFallback")
    public String getUserInfo() {
        return restTemplate.getForEntity("http://user/user", String.class).getBody();
    }

    @Override
    @HystrixCommand(fallbackMethod = "userInfoFallback2")
    public String getUserInfo2() {
        return restTemplate.getForEntity("http://user/user", String.class).getBody();
    }

    public String userInfoFallback() {
        return "hystrix";
    }

    public String userInfoFallback2() {
        return "hystrix2";
    }


}
