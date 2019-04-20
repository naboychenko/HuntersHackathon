package ru.hunters.doctorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import ru.hunters.common.feign.FeignClientConfiguration;

@SpringBootApplication
@RefreshScope
@EnableEurekaClient
@Import(FeignClientConfiguration.class)
public class DoctorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorServiceApplication.class, args);
    }

}
