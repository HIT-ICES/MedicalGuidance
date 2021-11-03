package com.hitices.medicalguidance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lei
 * @version 0.1
 * @date 2021/9/21
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class);
    }
}
