package com.tolgaaksoy.franchiseApplication.services;

import com.tolgaaksoy.franchiseApplication.dto.AppealDto;
import com.tolgaaksoy.franchiseApplication.mapper.AddressMapper;
import com.tolgaaksoy.franchiseApplication.mapper.AppealMapper;
import com.tolgaaksoy.franchiseApplication.mapper.CustomerMapper;
import com.tolgaaksoy.franchiseApplication.models.Address;
import com.tolgaaksoy.franchiseApplication.models.Appeal;
import com.tolgaaksoy.franchiseApplication.models.Customer;
import com.tolgaaksoy.franchiseApplication.repositories.AddressRepository;
import com.tolgaaksoy.franchiseApplication.repositories.AppealRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AppealServiceImpl implements AppealService{

    private final AppealRepository appealRepository;

    private final CustomerServiceImpl customerService;

    private final AddressRepository addressRepository;

    private final AppealMapper appealMapper;

    private final CustomerMapper customerMapper;

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

        return appealMapper.toAppealDto(appealRepository.save(appeal));
    }

    @Override
    public List<AppealDto> getAppealList(){
        return appealMapper.toAppealDtoList(appealRepository.findAll());
    }

    @Override
    public AppealDto getAppeal(long appealId){
        AppealDto appealDto = appealMapper.toAppealDto(appealRepository.findById(appealId).orElseThrow(() -> new IllegalArgumentException("Appeal : " + appealId + "does not exist !")));
        return appealDto;
    }

    @Override
    public void deleteAppeal(long appealId){
        appealRepository.delete(appealRepository.findById(appealId).orElseThrow(() -> new IllegalArgumentException("Appeal : " + appealId + "does not exist !")));
    }

}
