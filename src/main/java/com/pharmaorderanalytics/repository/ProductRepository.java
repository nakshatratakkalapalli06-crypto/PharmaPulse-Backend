package com.pharmaorderanalytics.repository;

import com.pharmaorderanalytics.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}