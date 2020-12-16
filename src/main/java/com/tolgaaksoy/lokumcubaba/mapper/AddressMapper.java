package com.tolgaaksoy.lokumcubaba.mapper;

import com.tolgaaksoy.lokumcubaba.dto.AddressDto;

import com.tolgaaksoy.lokumcubaba.models.Address;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    @Named("toAddress")
    Address toAddress(AddressDto addressDto);

    @Named("toAddressDto")
    AddressDto toAddressDto(Address Address);
}
