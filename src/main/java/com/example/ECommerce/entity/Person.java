package com.example.ECommerce.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/***
 * This is Person entity
 * An entity in JPA represents a table stored in a database.
 * Author: Mohammed Kharma
 */


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

@Table
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    private String email;
    private Long personNumber;
    private Boolean isActive;
    private String securityNumber;
    private String departmentCode;
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    private Address address;
}
