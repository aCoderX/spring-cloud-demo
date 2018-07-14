package com.acoderx.springclouddemo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by xudi on 2018/4/19.
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {
    public static void main(String[] args){
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
