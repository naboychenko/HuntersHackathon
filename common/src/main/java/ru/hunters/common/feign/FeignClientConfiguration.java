package ru.hunters.common.feign;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ru.hunters.common.feign")
@ComponentScan
@EntityScan(basePackages = "ru.hunters.common.domain")
public class FeignClientConfiguration {
}