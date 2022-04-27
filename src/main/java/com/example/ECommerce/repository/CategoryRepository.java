package com.example.ECommerce.repository;

import com.example.ECommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring recognize repositories by the fact that they extend one of the predefined Repository interfaces
 * Author: Mohammed Kharma
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
