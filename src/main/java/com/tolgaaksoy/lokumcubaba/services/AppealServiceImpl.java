package com.tolgaaksoy.lokumcubaba.services;

import com.tolgaaksoy.lokumcubaba.dto.AppealDto;
import com.tolgaaksoy.lokumcubaba.mapper.AddressMapper;
import com.tolgaaksoy.lokumcubaba.mapper.AppealMapper;
import com.tolgaaksoy.lokumcubaba.mapper.CustomerMapper;
import com.tolgaaksoy.lokumcubaba.models.Address;
import com.tolgaaksoy.lokumcubaba.models.Appeal;
import com.tolgaaksoy.lokumcubaba.models.Customer;
import com.tolgaaksoy.lokumcubaba.repositories.AddressRepository;
import com.tolgaaksoy.lokumcubaba.repositories.AppealRepository;
import com.tolgaaksoy.lokumcubaba.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppealServiceImpl implements AppealService{

    private final AppealRepository appealRepository;

    private final AddressRepository addressRepository;

    private final AppealMapper appealMapper;

    private final CustomerMapper customerMapper;

    private final CustomerRepository customerRepository;

    private final AddressMapper addressMapper;

    @Override
    public AppealDto addAppeal(AppealDto appealDto) {
        Appeal appeal = appealMapper.toAppeal(appealDto);

        Address appealAddress = addressMapper.toAddress(appealDto.getAddressDto());

        appeal.setAddress(appealAddress);

        Customer customer = customerMapper.toCustomer(appealDto.getCustomerDto());

        Address customerAddress = addressMapper.toAddress(appealDto.getCustomerDto().getAddressDto());

        customer.setAddress(customerAddress);

        appeal.setCustomer(customer);



////        customerRepository.save(customerMapper.toCustomer(appealDto.getCustomerDto()));
//
////        customerAddressRepository.saveAll(customerAddressMapper.toCustomerAddressList(appealDto.getCustomerDto().getCustomerAddressesDto()));
//        Appeal appeal = appealMapper.toAppeal(appealDto);
//        appeal.setAppealAddress(addressMapper.toAppealAddress(appealDto.getAddressDto()));
//        Customer customer = customerMapper.toCustomer(appealDto.getCustomerDto());
//        List<CustomerAddress> customerAddresses = customerAddressMapper.toCustomerAddressList(appealDto.getCustomerDto().getCustomerAddressesDto());
////        customer.setCustomerAddresses(customerAddresses);
//        appeal.setCustomer(customer);
////        appeal.getCustomer().setCustomerAddresses(customerAddressMapper.toCustomerAddressList(appealDto.getCustomerDto().getCustomerAddressesDto()));
//
//
//        appealRepository.save(appeal);
//
        return appealMapper.toAppealDto(appealRepository.save(appeal));


    }


}
