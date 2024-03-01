package com.loanservice.loanservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_requests")
public class LoanRequest {

    public LoanRequest() {
    }

    public LoanRequest(Long id, String borrower, Integer amount) {
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
    private Integer amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    // toString method
    @Override
    public String toString() {
        return "LoanRequest{" +
                "borrower='" + borrower + '\'' +
                ", amount=" + amount +
                '}';
    }
}
