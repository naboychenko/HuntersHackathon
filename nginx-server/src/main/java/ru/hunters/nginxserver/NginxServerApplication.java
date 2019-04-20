package ru.hunters.nginxserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class NginxServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NginxServerApplication.class, args);
    }

}
