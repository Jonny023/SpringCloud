package com.jonny.service1;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 19:46
 * @modificed by:
 */
@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class Service1Application {

  public static void main(String[] args) {
    SpringApplication.run(Service1Application.class, args);
  }
}
