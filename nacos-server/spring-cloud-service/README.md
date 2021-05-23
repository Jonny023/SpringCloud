* 模块说明

├─nacos-server （父工程pom）

  ├─nacos-consumer （nacos消费者）
  ├─nacos-provider （nacos生产者）
  └─spring-cloud-service （springcloud+nacos+zuul+openfeign+dubbo）
      ├─spring-cloud-app (api应用，调用服务1)
      ├─spring-cloud-gateway （zuul网关路由转发）
      ├─spring-cloud-service1 （服务1，通过dubbo调用服务2）
      │  ├─spring-cloud-service1-api
      │  └─spring-cloud-service1-server
      └─spring-cloud-service2 (服务2，通过dubbo暴露服务)
          ├─spring-cloud-service2-api
          └─spring-cloud-service2-server
         

