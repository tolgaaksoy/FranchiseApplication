package com.tolgaaksoy.franchiseApplication.dto;

import lombok.*;
import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto extends BaseDto{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String idNumber;
    private String birthDate;
    private AddressDto addressDto;
    private List<AppealDto> appealListDto;
}
