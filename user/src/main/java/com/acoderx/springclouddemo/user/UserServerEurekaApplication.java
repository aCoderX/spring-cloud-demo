package com.acoderx.springclouddemo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by xudi on 2018/4/18.
 */
@SpringBootApplication
@EnableEurekaClient
public class UserServerEurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(UserServerEurekaApplication.class, args);
    }
}
