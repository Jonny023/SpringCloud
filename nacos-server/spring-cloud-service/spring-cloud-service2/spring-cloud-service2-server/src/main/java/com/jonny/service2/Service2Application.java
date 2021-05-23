package com.jonny.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 20:51
 * @modificed by:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service2Application {

  public static void main(String[] args) {
    SpringApplication.run(Service2Application.class, args);
  }
}
