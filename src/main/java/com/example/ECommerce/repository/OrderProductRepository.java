package com.example.ECommerce.repository;
import com.example.ECommerce.entity.OrderProduct;
import com.example.ECommerce.entity.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}