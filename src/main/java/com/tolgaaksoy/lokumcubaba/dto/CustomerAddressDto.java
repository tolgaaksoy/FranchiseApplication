package com.tolgaaksoy.lokumcubaba.dto;

import com.tolgaaksoy.lokumcubaba.models.Customer;

import lombok.*;

@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAddressDto extends BaseDto{
    private Customer customer;

}
