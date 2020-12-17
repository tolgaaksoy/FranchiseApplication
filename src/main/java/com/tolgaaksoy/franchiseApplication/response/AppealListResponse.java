package com.tolgaaksoy.franchiseApplication.response;

import com.tolgaaksoy.franchiseApplication.dto.AppealDto;
import lombok.Data;

import java.util.List;

@Data
public class AppealListResponse {
    List<AppealDto> appealDtoList;
}
