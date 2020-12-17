package com.tolgaaksoy.franchiseApplication.services;

import com.tolgaaksoy.franchiseApplication.dto.CustomerDto;
import com.tolgaaksoy.franchiseApplication.mapper.AddressMapper;
import com.tolgaaksoy.franchiseApplication.mapper.CustomerMapper;
import com.tolgaaksoy.franchiseApplication.models.Customer;
import com.tolgaaksoy.franchiseApplication.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    private final AddressMapper addressMapper;

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        Customer customer = customerMapper.toCustomer(customerDto);
        customer.setAddress(addressMapper.toAddress(customerDto.getAddressDto()));
        return  customerMapper.toCustomerDto(customerRepository.save(customer));
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        Customer customer = customerRepository.findById(customerDto.getId()).orElseThrow(() -> new IllegalArgumentException("Customer : " + customerDto.getId() + "does not exist !"));
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setBirthDate(customerDto.getBirthDate());
        customer.setIdNumber(customer.getIdNumber());
        customer.setEmail(customerDto.getEmail());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setAddress(addressMapper.toAddress(customerDto.getAddressDto()));
        return customerMapper.toCustomerDto(customerRepository.save(customer));
    }

    @Override
    public void deleteCustomer(long customerId) {
        customerRepository.delete(customerRepository.findById(customerId).orElseThrow(() -> new IllegalArgumentException("Customer : " + customerId + "does not exist !")));
    }

    @Override
    public CustomerDto getCustomer(long customerId) {
        return customerMapper.toCustomerDto(customerRepository.findById(customerId).orElseThrow(() -> new IllegalArgumentException("Customer : " + customerId + "does not exist !")));
    }

    @Override
    public List<CustomerDto> getCustomers() {
        return customerMapper.toCustomerDtoList(customerRepository.findAll());
    }

    @Override
    public CustomerDto getByIdNumber(String idNumber) {
        return null;
    }

}
