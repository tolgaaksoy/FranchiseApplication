package com.tolgaaksoy.franchiseApplication.repositories;

import com.tolgaaksoy.franchiseApplication.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
