package com.jonny.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 17:25
 * @modificed by:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosConsumerApplicatrion {

  public static void main(String[] args) {
    SpringApplication.run(NacosConsumerApplicatrion.class, args);
  }
}
