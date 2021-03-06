package com.sekolahbackend.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sekolahbackend.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByUserId(Integer userId);

    Page<Transaction> findByUserFullNameContainsIgnoreCase(String fullName, Pageable pageable);

    Page<Transaction> findByInvoiceNumberContainsIgnoreCase(String invoiceNumber, Pageable pageable);

    Page<Transaction> findAll(Pageable pageable);
}