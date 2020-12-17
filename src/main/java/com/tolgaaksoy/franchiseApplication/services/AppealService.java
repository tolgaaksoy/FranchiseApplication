package com.tolgaaksoy.franchiseApplication.services;

import com.tolgaaksoy.franchiseApplication.dto.AppealDto;

import java.util.List;

public interface AppealService {
    AppealDto addAppeal(AppealDto appealDto);
    void deleteAppeal(long appealId);
    AppealDto getAppeal(long appealId);
    List<AppealDto> getAppealList();
}
