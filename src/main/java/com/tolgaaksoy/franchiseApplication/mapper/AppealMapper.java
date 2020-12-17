package com.tolgaaksoy.franchiseApplication.mapper;

import com.tolgaaksoy.franchiseApplication.dto.AppealDto;
import com.tolgaaksoy.franchiseApplication.models.Appeal;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AppealMapper {
    @Named("toAppeal")
    Appeal toAppeal(AppealDto appealDto);

    @Named("toAppealDto")
    AppealDto toAppealDto(Appeal appeal);

    @IterableMapping(qualifiedByName = "toAppealList")
    List<Appeal> toAppealList(List<AppealDto> appealDtoList);

    @IterableMapping(qualifiedByName = "toAppealDtoList")
    List<AppealDto> toAppealDtoList(List<Appeal> appeals);
}
