package com.pharmaorderanalytics.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pharmaorderanalytics.entity.Supplier;
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}