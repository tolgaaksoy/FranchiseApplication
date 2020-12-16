package com.tolgaaksoy.lokumcubaba.dto;

import lombok.*;


@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppealDto extends BaseDto {
    private int investmentAmount;
    private String appealDescription;
    private String extraDescription;
    private AddressDto addressDto;
    private CustomerDto customerDto;
}
