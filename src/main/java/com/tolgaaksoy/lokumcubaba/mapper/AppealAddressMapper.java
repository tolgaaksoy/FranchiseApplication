package com.tolgaaksoy.lokumcubaba.mapper;

import com.tolgaaksoy.lokumcubaba.dto.AppealAddressDto;
import com.tolgaaksoy.lokumcubaba.dto.AppealDto;
import com.tolgaaksoy.lokumcubaba.models.Appeal;

import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface AppealAddressMapper {
    @Named("toAppealAddress")
    Appeal toAppealAddress(AppealAddressDto appealAddressDto);

    @Named("toAppealDto")
    AppealDto toAppealAddressDto(AppealAddressDto appealAddressDto);
}
