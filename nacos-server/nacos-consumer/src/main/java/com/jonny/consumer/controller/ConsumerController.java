package com.jonny.consumer.controller;

import com.jonny.consumer.service.ProviderService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 17:33
 * @modificed by:
 */
@RestController
public class ConsumerController {

  @Resource
  private ProviderService providerService;

  @GetMapping("/")
  public String index() {
    return "consumer-serer call " + providerService.register();
  }

}
