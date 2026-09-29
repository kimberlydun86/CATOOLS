package org.example.catools.services;


import org.example.catools.domains.CustomerType;
import org.example.catools.repositories.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService {

    private final CustomerTypeRepository customerRepo;

    @Autowired
    public CustomerTypeService (CustomerTypeRepository customerRepo){
        this.customerRepo = customerRepo;
    }


    /**
     * Retrieves all users from the database.
     * Uses the inherited JpaRepository functionality.
     */
    public List<CustomerType> getAllUsers() {
        return customerRepo.findAll(); // Generates: SELECT * FROM users
    }
}
