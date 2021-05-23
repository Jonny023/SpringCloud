package com.jonny.service1.service;

import com.jonny.service1.api.IUserService;
import com.jonny.service2.api.IOrderService;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 19:34
 * @modificed by:
 */
@org.apache.dubbo.config.annotation.Service
public class UserServiceImpl implements IUserService {

  @org.apache.dubbo.config.annotation.Reference
  private IOrderService orderService;

  @Override
  public String register() {
    String str = orderService.createOrder();
    return "user register service, "+ str;
  }
}
