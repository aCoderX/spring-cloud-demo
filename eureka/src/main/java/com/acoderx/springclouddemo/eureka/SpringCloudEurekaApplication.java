package com.acoderx.springclouddemo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by xudi on 2018/4/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
