package com.loanservice.loanservice.repository;

import com.loanservice.loanservice.model.LoanRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanRequest,Long> {
    //This will provide all the CRUD Operation
}
