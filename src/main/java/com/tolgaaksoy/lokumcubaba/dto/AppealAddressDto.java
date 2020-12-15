package com.tolgaaksoy.lokumcubaba.dto;

import com.tolgaaksoy.lokumcubaba.models.Appeal;

import lombok.*;

@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppealAddressDto extends BaseAddressDto{
    private Appeal appeal;
}
