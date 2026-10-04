package org.example.catools.controllers;

import org.example.catools.domains.Caterm;
import org.example.catools.domains.CustomerType;
import org.example.catools.services.CatermsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/caterm")
public class CatermsController {

    private CatermsService catermsService;

    @Autowired
    public CatermsController ( CatermsService catermsService){
        this.catermsService = catermsService;
    }


    @PostMapping("saveCaterm")
    public void saveCaterm (@RequestParam String primaryBorrowerId, @RequestParam String requestedDate,
                                                  @RequestParam String requestedAmount){



        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate requesedtDate = LocalDate.parse(requestedDate, formatter);

        Caterm term = new Caterm();
        term.setReguestedMorgageAmount(Integer.valueOf(requestedAmount));

        Date date = Date.from(
                requesedtDate.atStartOfDay(ZoneId.systemDefault()).toInstant()
        );

        term.setRequestDate(date);
        term.setPrimaryBorrowerId(Long.valueOf(primaryBorrowerId));

        catermsService.saveCaterm(term);

    }
}
