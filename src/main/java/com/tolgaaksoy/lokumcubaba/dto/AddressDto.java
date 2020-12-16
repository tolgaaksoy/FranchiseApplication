package com.tolgaaksoy.lokumcubaba.dto;

import lombok.*;

@EqualsAndHashCode(callSuper=false)
@Data
public class AddressDto extends BaseDto{
    private String province;
    private String district;
    private String neighborhood;
    private String description;
}
