package com.pharmaorderanalytics.repository;

import com.pharmaorderanalytics.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}