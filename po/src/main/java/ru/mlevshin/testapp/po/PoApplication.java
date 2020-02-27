package ru.mlevshin.testapp.po;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import ru.mlevshin.testapp.po.order.clients.ProductSpecificationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = ProductSpecificationRepository.class)
@EnableEurekaClient
public class PoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoApplication.class, args);
    }
}
