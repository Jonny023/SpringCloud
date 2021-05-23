package com.jonny.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 17:34
 * @modificed by:
 */
@FeignClient(value = "provider-service")
public interface ProviderService {

  @GetMapping("/register")
  String register();
}
