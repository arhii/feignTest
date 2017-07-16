package pl.arhii.Feign_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@Configuration
@SpringBootApplication
@EnableFeignClients(basePackages = "pl.arhii.Feign_test.REST")
@EnableAutoConfiguration
public class FeignTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignTestApplication.class, args);
    }
}
