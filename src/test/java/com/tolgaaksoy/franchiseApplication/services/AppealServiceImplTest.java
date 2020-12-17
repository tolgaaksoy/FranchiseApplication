package com.tolgaaksoy.franchiseApplication.services;

import com.tolgaaksoy.franchiseApplication.dto.AddressDto;
import com.tolgaaksoy.franchiseApplication.dto.AppealDto;
import com.tolgaaksoy.franchiseApplication.dto.CustomerDto;
import com.tolgaaksoy.franchiseApplication.mapper.AddressMapper;
import com.tolgaaksoy.franchiseApplication.mapper.AppealMapper;
import com.tolgaaksoy.franchiseApplication.models.Address;
import com.tolgaaksoy.franchiseApplication.models.Appeal;
import com.tolgaaksoy.franchiseApplication.models.Customer;
import com.tolgaaksoy.franchiseApplication.repositories.AppealRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith(MockitoExtension.class)
class AppealServiceImplTest {
    /**
     @Mock
    private AppealMapper appealMapper;
    @Mock
    private AppealRepository appealRepository;
    @InjectMocks
    private AppealServiceImpl appealService;
    @Mock
    private AddressMapper addressMapper;


    @Test
    void addAppeal() {
        Appeal appeal = new Appeal();
        AppealDto appealDtoRequest = new AppealDto();
        AppealDto appealDtoResponse = new AppealDto();

        Mockito.when(appealRepository.save(appeal)).thenReturn(new Appeal(10000,true,"appealDescription","extraDescription",new Customer(),new Address()));

        appeal.setInvestmentAmount(10000);
        appeal.setExperience(true);
        appeal.setAppealDescription("appealDescription");
        appeal.setExtraDescription("extraDescription");
        appealDtoRequest = appealMapper.toAppealDto(appeal);
        **/

        // NullPointeException - BAKILACAK

        /**
        appealDtoRequest.setAddressDto(addressMapper.toAddressDto(new Address("x","x","x","x",null,null)));
        appealDtoRequest.setCustomerDto(null);

        appealDtoResponse = appealService.addAppeal(appealDtoRequest);

        assertThat(appealDtoResponse).isNotNull();

        assertEquals(1000, appealDtoResponse.getInvestmentAmount());
        assertEquals(true, appealDtoResponse.isExperience());
        assertEquals("appealDescription",appealDtoResponse.getAppealDescription());
        assertEquals("extraDescription",appealDtoResponse.getExtraDescription());

    }

    @Test
    void getAppealList() {
    }

    @Test
    void getAppeal() {
    }

    @Test
    void deleteAppeal() {
    }
         **/
}