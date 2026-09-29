package org.example.catools.controllers;


import org.example.catools.domains.CustomerType;
import org.example.catools.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerTypeController {


    private final CustomerTypeService customerTypeService;

    @Autowired
    public CustomerTypeController(CustomerTypeService customerTypeService) {
        this.customerTypeService = customerTypeService;
    }

    @GetMapping("/customerTypes")
    public ResponseEntity<List<CustomerType>> getAllTypes() {

        List<CustomerType> types;
        types = customerTypeService.getAllUsers();
        return ResponseEntity.ok(types); // Returns HTTP 200 OK with the list of users
    }

}
