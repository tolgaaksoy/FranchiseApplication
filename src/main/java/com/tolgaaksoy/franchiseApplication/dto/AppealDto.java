package com.tolgaaksoy.franchiseApplication.dto;

import lombok.*;


@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppealDto extends BaseDto {
    private int investmentAmount;
    private boolean experience;
    private String appealDescription;
    private String extraDescription;
    private AddressDto addressDto;
    private CustomerDto customerDto;
}
