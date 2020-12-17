package com.tolgaaksoy.franchiseApplication.response;

import com.tolgaaksoy.franchiseApplication.dto.CustomerDto;
import lombok.Data;

import java.util.List;

@Data
public class CustomerListResponse {
    List<CustomerDto> customerDtoList;
}
