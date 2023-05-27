package com.example.tp5_microservice.repository;

import com.example.tp5_microservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
