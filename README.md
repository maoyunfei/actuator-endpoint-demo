# actuator-endpoint-demo

`@RestControllerEndpoint`注解是Spring Boot 2.0的新特性。

1. 添加`actuator`依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

2. 编写`RestControllerEndpoint`端点类。

3. 暴露端口。

```yml
management:
  endpoints:
    web:
      exposure:
        include: example
```


访问路径为 `ip:port/actuator/{endpointId}/{path}`

<a href="https://asciinema.org/a/DSCWHBzpm7t0SNdnFGjzyOz0N?autoplay=1"><img src="https://asciinema.org/a/DSCWHBzpm7t0SNdnFGjzyOz0N.png" width="836"/></a>
