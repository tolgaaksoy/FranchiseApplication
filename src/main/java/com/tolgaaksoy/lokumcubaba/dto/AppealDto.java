package com.tolgaaksoy.lokumcubaba.dto;

import com.tolgaaksoy.lokumcubaba.models.AppealAddress;
import com.tolgaaksoy.lokumcubaba.models.Customer;
import lombok.*;


@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppealDto extends BaseDto {
    private Customer customer;
    private AppealAddress appealAddress;
    private int investmentAmount;
    private String appealDescription;
    private String extraDescription;
}
