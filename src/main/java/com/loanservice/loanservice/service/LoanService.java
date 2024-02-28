package com.loanservice.loanservice.service;

import com.loanservice.loanservice.model.LoanRequest;
import com.loanservice.loanservice.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoanService {

    @Autowired
    private final LoanRepository loanRepository;


    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

public LoanRequest createLoan(LoanRequest loanRequest){
        LoanRequest loanSaved = loanRepository.save(loanRequest);

        // send notification here
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.postForObject("http://localhost:8081/notify",loanRequest, Void.class);
    return loanSaved;

    }
}
