package com.acoderx.springclouddemo.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by xudi on 2018/4/19.
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class HystrixDashboardApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
