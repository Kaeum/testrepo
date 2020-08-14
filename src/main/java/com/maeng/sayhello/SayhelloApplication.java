package com.maeng.sayhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SayhelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SayhelloApplication.class, args);
    }

}
