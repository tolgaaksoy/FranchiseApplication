package com.tolgaaksoy.lokumcubaba.mapper;

import com.tolgaaksoy.lokumcubaba.dto.AppealDto;
import com.tolgaaksoy.lokumcubaba.models.Appeal;
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

    @IterableMapping
    List<AppealDto> toAppealDtoList(List<Appeal> appeals);
}
