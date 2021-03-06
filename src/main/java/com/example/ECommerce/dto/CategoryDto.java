package com.example.ECommerce.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class CategoryDto {
    private Long id;

    @NotNull
    @Size(min = 3, max = 250)
    private String name;

    private String description;

    private String CreatedBy;

    private Boolean isActive;

    private Date CreationDate;
}
