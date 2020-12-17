package com.tolgaaksoy.franchiseApplication.mapper;

import com.tolgaaksoy.franchiseApplication.dto.AddressDto;

import com.tolgaaksoy.franchiseApplication.models.Address;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    @Named("toAddress")
    Address toAddress(AddressDto addressDto);

    @Named("toAddressDto")
    AddressDto toAddressDto(Address Address);
}
