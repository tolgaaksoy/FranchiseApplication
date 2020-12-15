package com.tolgaaksoy.lokumcubaba.services;

import com.tolgaaksoy.lokumcubaba.dto.AppealDto;
import com.tolgaaksoy.lokumcubaba.mapper.AppealMapper;
import com.tolgaaksoy.lokumcubaba.repositories.AppealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppealServiceImpl implements AppealService{

    private final AppealRepository appealRepository;

    private final AppealMapper appealMapper;

    @Override
    public AppealDto addAppeal(AppealDto appealDto) {
        return appealMapper.toAppealDto(appealRepository.save(appealMapper.toAppeal(appealDto)));
    }
}
