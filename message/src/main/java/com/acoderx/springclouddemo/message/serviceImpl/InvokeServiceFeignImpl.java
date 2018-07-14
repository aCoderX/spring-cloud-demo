package com.acoderx.springclouddemo.message.serviceImpl;

import com.acoderx.springclouddemo.message.service.InvokeService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xudi on 2018/4/18.
 */
@FeignClient(name= "user",fallback = ServiceHystrix.class)
public interface InvokeServiceFeignImpl extends InvokeService {

    @Override
    @RequestMapping(method = RequestMethod.GET,value = "/user")
    String getUserInfo();

    @Override
    @RequestMapping(method = RequestMethod.GET,value = "/user")
    String getUserInfo2();
}
