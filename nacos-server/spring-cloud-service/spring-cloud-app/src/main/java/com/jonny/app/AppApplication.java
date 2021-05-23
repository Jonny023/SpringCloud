package com.jonny.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 19:13
 * @modificed by:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppApplication.class, args);
  }
}
