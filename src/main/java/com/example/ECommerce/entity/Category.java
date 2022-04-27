package com.example.ECommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "category_tbl", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})}
)
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    @Column
    private String CreatedBy;

    @Column
    private Boolean isActive;

    @Column
    private Date CreationDate;
}
