package org.example.catools.services;

import org.example.catools.domains.Caterm;
import org.example.catools.repositories.CatermsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatermsService {

    private CatermsRepository catermsRepository;

    @Autowired
    public CatermsService(CatermsRepository catermsRepository){
        this.catermsRepository = catermsRepository;
    }

    public Optional<Caterm> getCatermByCustomerId(Integer customerId){
      return   catermsRepository.findById(Long.valueOf(customerId));
    }

    public void saveCaterm (Caterm termRecord) {
        catermsRepository.save(termRecord);

    }

    public void deleteCatermById(Integer catermId) {
        catermsRepository.deleteById(Long.valueOf(catermId));
    }

    public Boolean isCatermValidForSave(Caterm term){
        return term.getPrimaryBorrowerId() != null && term.getRequestedMorgageAmount() != null
                && term.getRequestDate() != null;
        }

}
