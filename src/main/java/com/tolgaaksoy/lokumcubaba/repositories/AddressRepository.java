package com.tolgaaksoy.lokumcubaba.repositories;

import com.tolgaaksoy.lokumcubaba.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
