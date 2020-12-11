package org.sid.billingservice;

import org.sid.billingservice.Feign.CustomerRestClient;
import org.sid.billingservice.Model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication{

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRestClient customerRestClient){
        return args ->{
            Customer c = customerRestClient.getCustomerById(1L);
            System.out.println(c.toString());
        };
    }
}
