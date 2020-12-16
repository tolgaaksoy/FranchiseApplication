package com.tolgaaksoy.lokumcubaba.services;

import com.tolgaaksoy.lokumcubaba.dto.CustomerDto;
import com.tolgaaksoy.lokumcubaba.mapper.CustomerMapper;
import com.tolgaaksoy.lokumcubaba.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl {

    private final CustomerMapper customerMapper;

    private final CustomerRepository customerRepository;


    public CustomerDto addAppeal(CustomerDto appealDto) {
//        return appealMapper.toAppealDto(appealRepository.save(appealMapper.toAppeal(appealDto)));
        return customerMapper.toCustomerDto(customerRepository.save(customerMapper.toCustomer(appealDto)));
    }
}
