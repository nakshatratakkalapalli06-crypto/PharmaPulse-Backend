package com.pharmaorderanalytics.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pharmaorderanalytics.entity.Supplier;
import com.pharmaorderanalytics.repository.SupplierRepository;
@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }
    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
    public Supplier updateSupplier(Long id, Supplier supplier) {
        supplier.setId(id);
        return supplierRepository.save(supplier);
    }
    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}