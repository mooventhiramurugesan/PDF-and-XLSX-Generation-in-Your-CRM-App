package com.example.CrmApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrmApplication.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
