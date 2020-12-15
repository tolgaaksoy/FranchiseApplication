package com.tolgaaksoy.lokumcubaba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseAddressDto extends BaseDto {
    private String province;
    private String district;
    private String neighborhood;
    private String description;
}
