# cloud-framework
`springcloud`骨架项目
### 服务说明
#### `eureka-server`
 * 提供服务注册与发现的服务
    > 目前本项目中的服务都会注册到 `eureka-server`，服务的端口号为 8761
#### `gateway-server`
 * 服务网关，进行请求路由
    > 目前本项目中的服务都是由服务网关根据配置的路由规则进行勤求的转发
#### `order-client-ribbon`    
 * 基于ribbon实现的服务客户端
    > 通过 RestTemplate 实现服务调用               
#### `order-client-feign`    
  * 基于FeignClient实现的服务客户端
     > 通过 FeignClient 实现服务调用             
#### `order-service`
 * 服务提供者，提供查询订单信息
#### `hystrix-dashboard`
 * 服务熔断降级监控面板
#### `config-server`
 * 配置中心