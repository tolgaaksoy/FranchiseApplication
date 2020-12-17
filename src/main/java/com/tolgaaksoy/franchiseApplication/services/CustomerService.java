package com.tolgaaksoy.franchiseApplication.services;

import com.tolgaaksoy.franchiseApplication.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto addCustomer(CustomerDto customerDto);
    CustomerDto getCustomer(long customerId);
    CustomerDto getByIdNumber(String idNumber);
    CustomerDto updateCustomer(CustomerDto customerDto);
    void deleteCustomer(long customerId);
    List<CustomerDto> getCustomers();
}
