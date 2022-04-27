package com.example.ECommerce.controller;

import com.example.ECommerce.dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping(value = "/student")
    public CustomerDto getSCustomer() {
        return new CustomerDto("qassam", "awad");
    }

    @GetMapping(value = "/students")
    public List<CustomerDto> getSCustomers() {
        List<CustomerDto> customerList = new ArrayList<CustomerDto>();
        for (int i = 0; i < 5; i++) {
            customerList.add(new CustomerDto("name" + i, "lastname" + i));
        }
        return customerList;
    }

    @GetMapping(value = "/student/V2")
    public ResponseEntity<CustomerDto> getSCustomerV2() {
        return ResponseEntity.ok(new CustomerDto("Mohammed", "Ahmad"));
    }

    @GetMapping(value = "/student/{firstName}/{lastName}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return ResponseEntity.ok(new CustomerDto(firstName, lastName));
    }

    @GetMapping(value = "/studentRequestParam")
    public ResponseEntity<CustomerDto> getCustomerRequestParam(@RequestParam("firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return ResponseEntity.ok(new CustomerDto(firstName, lastName));
    }

}
