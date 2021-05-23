package com.jonny.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 17:32
 * @modificed by:
 */
@RestController
public class ProviderController {

  protected Logger log = LoggerFactory.getLogger(ProviderController.class);

  @GetMapping("/register")
  public String register() {
    log.info("provider register");
    return "provider register";
  }
}
