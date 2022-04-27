package com.example.ECommerce.controller;

import com.example.ECommerce.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APIWrapperController {
    private final Logger log = LoggerFactory.getLogger(APIWrapperController.class);

    @Autowired
    @Qualifier(value = "restTemplate")
    RestTemplate restTemplate;

    public APIWrapperController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/api/user")
    public ResponseEntity<User[]> all(@RequestParam(value = "name", defaultValue = "qassam") String name) {
//        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> response =
                restTemplate.getForEntity(
                        "https://gorest.co.in/public/v2/users",
                        User[].class);
        User[] userList = response.getBody();
        return ResponseEntity.ok().body(userList);
    }
}
