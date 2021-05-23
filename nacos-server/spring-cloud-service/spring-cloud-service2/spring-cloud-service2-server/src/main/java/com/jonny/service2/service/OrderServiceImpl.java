package com.jonny.service2.service;

import com.jonny.service2.api.IOrderService;

/**
 * @author: e-lijing6
 * @description:
 * @date:created in 2021/5/23 20:50
 * @modificed by:
 */
@org.apache.dubbo.config.annotation.Service
public class OrderServiceImpl implements IOrderService {

  @Override
  public String createOrder() {
    return "create order success";
  }
}
