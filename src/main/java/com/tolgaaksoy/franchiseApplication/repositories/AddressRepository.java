package com.tolgaaksoy.franchiseApplication.repositories;

import com.tolgaaksoy.franchiseApplication.dto.AddressDto;
import com.tolgaaksoy.franchiseApplication.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
//    AddressDto findAddressByCus
}
