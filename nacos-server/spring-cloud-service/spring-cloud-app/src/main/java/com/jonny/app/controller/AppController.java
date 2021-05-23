package com.jonny.app.controller;

import com.jonny.service1.api.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 19:13
 * @modificed by:
 */
@RestController
public class AppController {

  @org.apache.dubbo.config.annotation.Reference
  private IUserService userService;

  @GetMapping("/")
  public String index() {
    return userService.register();
  }
}
