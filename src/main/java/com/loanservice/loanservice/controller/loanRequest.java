package com.loanservice.loanservice.controller;

import jakarta.persistence.*;

@Entity
public class loanRequest {

    public loanRequest() {
    }

    public loanRequest(Long id, String borrower, double amount) {
        this.id = id;
        this.borrower = borrower;
        this.amount = amount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "borrower")
    private String borrower;

    @Column(name = "amount")
    private double amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
