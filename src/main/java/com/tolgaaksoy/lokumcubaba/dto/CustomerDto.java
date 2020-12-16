package com.tolgaaksoy.lokumcubaba.dto;

import com.tolgaaksoy.lokumcubaba.models.Address;
import lombok.*;
import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto extends BaseDto{
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String idNumber;
    private String birthday;
    private AddressDto addressDto;
    private List<AppealDto> appealListDto;
}
