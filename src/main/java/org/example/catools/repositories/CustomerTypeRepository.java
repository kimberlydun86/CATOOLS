package org.example.catools.repositories;

import org.example.catools.domains.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepository   extends JpaRepository<CustomerType, Long> {


}
