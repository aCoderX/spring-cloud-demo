package com.acoderx.springclouddemo.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xudi on 2018/4/18.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class MessageServerEurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(MessageServerEurekaApplication.class, args);
    }

    @Bean //定义REST客户端，RestTemplate实例
    @LoadBalanced//开启负债均衡的能力
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
