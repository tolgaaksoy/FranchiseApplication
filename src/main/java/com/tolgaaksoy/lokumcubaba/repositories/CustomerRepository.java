package com.tolgaaksoy.lokumcubaba.repositories;

import com.tolgaaksoy.lokumcubaba.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
