package com.example.ECommerce.repository;
import com.example.ECommerce.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}