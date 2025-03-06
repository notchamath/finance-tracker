package com.genspark.financetracker.repository;

import com.genspark.financetracker.model.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<UserTransaction, Long> {
}
