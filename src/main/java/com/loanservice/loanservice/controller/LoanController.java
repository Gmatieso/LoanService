package com.loanservice.loanservice.controller;

import com.loanservice.loanservice.model.LoanRequest;
import com.loanservice.loanservice.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    private final LoanService   loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/create")
       public ResponseEntity<LoanRequest> createLoan(@RequestBody LoanRequest loanRequest){
        LoanRequest newLoanRequest = loanService.createLoan(loanRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLoanRequest);

    }

}

