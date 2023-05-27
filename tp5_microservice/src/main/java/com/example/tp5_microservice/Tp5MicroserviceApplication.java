package com.example.tp5_microservice;

import com.example.tp5_microservice.entities.Customer;
import com.example.tp5_microservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class Tp5MicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp5MicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Customer.class);
        return  args -> {
            customerRepository.save(new Customer(null,"Oumaima","aitbahao.etu@gmail.com"));
            customerRepository.save(new Customer(null,"Anas","anas@gmail.com"));
            customerRepository.save(new Customer(null,"Saad","saad@gmail.com"));
            customerRepository.findAll().forEach(c -> {
                System.out.println(c.toString());

            });
        };
    }

}
