package com.example.batchprocessingdemo.repository;

import com.example.batchprocessingdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
