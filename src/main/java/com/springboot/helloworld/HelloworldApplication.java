package com.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        System.out.println("你好吗");
        System.out.println("解决了一个bug!");
        SpringApplication.run(HelloworldApplication.class, args);
    }
}
