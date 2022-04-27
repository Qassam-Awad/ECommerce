package com.example.ECommerce.repository;
import com.example.ECommerce.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}