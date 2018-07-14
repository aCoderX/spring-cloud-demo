package com.acoderx.springclouddemo.message.serviceImpl;

import com.acoderx.springclouddemo.message.service.InvokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xudi on 2018/4/18.
 */
//@Service
public class InvokeServiceEurekaImpl implements InvokeService {
    @Autowired
    private DiscoveryClient discoveryClient;
    
    @Override
    public String getUserInfo() {
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("user");
        //需自己处理负载均衡和http请求
        return null;
    }

    @Override
    public String getUserInfo2() {
        return null;
    }
}
