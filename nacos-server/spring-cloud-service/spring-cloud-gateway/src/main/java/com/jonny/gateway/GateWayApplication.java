package com.jonny.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 21:18
 * @modificed by:
 */
@SpringBootApplication
@EnableFeignClients
@EnableZuulProxy
public class GateWayApplication {

  public static void main(String[] args) {
    SpringApplication.run(GateWayApplication.class, args);
  }
}
