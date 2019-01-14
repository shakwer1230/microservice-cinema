package com.lvxk.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@Configuration . @EnableAutoConfiguration @ComponentScan 组合
public class ProviderApplication {
    public static void main(String[]args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}
