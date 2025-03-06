package com.genspark.financetracker.service;

import com.genspark.financetracker.model.UserTransaction;
import com.genspark.financetracker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepo;

    @Autowired
    public TransactionService(TransactionRepository transactionRepo){
        this.transactionRepo = transactionRepo;
    }

    public List<UserTransaction> getAllTransactions(){
        return transactionRepo.findAll();
    }
}
