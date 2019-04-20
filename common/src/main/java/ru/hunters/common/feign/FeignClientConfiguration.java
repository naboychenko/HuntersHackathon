package ru.hunters.common.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ru.hunters.common.feign")
public class FeignClientConfiguration {
}