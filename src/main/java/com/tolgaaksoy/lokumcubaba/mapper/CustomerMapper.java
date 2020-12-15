package com.tolgaaksoy.lokumcubaba.mapper;

import com.tolgaaksoy.lokumcubaba.dto.CustomerDto;
import com.tolgaaksoy.lokumcubaba.models.Customer;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Named("toCustomer")
    Customer toCustomer(CustomerDto customerDto);

    @Named("toCustomerDto")
    CustomerDto toCustomerDto(Customer customer);

    @IterableMapping(qualifiedByName = "toCustomerList")
    List<Customer> toCustomerList(List<CustomerDto> customerDtoList);

    @IterableMapping
    List<CustomerDto> toCustomerDtoList(List<Customer> customers);
}
