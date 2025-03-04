package com.genspark.financetracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class UserTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // convert to enum?
    private String category; // give option for user to add more
    private Double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
