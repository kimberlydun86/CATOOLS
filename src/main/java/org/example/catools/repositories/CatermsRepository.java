package org.example.catools.repositories;


import org.example.catools.domains.Caterm;
import org.example.catools.domains.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatermsRepository  extends JpaRepository<Caterm, Long> {
    List<Caterm> getCatermByPrimaryBorrowerId(Integer primaryBorrowerId);
}
