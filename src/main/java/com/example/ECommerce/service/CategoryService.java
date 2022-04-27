package com.example.ECommerce.service;

import com.example.ECommerce.dto.CategoryDto;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public interface CategoryService {
    CategoryDto createCategory(CategoryDto CategoryDto);

    @NotNull List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(long id);

    CategoryDto updateCategory(CategoryDto CategoryDto, long id);

    void deleteCategoryById(long id);
}
