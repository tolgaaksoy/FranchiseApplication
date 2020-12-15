package com.tolgaaksoy.lokumcubaba.mapper;

import com.tolgaaksoy.lokumcubaba.dto.CustomerAddressDto;
import com.tolgaaksoy.lokumcubaba.models.CustomerAddress;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerAddressMapper {
    @Named("toCustomerAddress")
    CustomerAddress toCustomerAddress(CustomerAddressDto customerAddressDto);

    @Named("toCustomerAddressDto")
    CustomerAddressDto toCustomerAddressDto(CustomerAddress customerAddress);

    @IterableMapping(qualifiedByName = "toCustomerList")
    List<CustomerAddress> toCustomerAddressList(List<CustomerAddressDto> customerAddressDtoList);

    @IterableMapping(qualifiedByName = "toCustomerAddressDtoList")
    List<CustomerAddressDto> toCustomerAddressDtoList(List<CustomerAddress> customerAddresses);
}
