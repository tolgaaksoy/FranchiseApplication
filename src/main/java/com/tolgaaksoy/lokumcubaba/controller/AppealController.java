package com.tolgaaksoy.lokumcubaba.controller;

import com.tolgaaksoy.lokumcubaba.dto.CustomerDto;
import com.tolgaaksoy.lokumcubaba.request.AppealRequest;
import com.tolgaaksoy.lokumcubaba.request.CustomerRequest;
import com.tolgaaksoy.lokumcubaba.response.AppealResponse;
import com.tolgaaksoy.lokumcubaba.response.CustomerResponse;
import com.tolgaaksoy.lokumcubaba.services.AppealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/appeal/")
public class AppealController {

    private final AppealService appealService;

    @PostMapping
    public ResponseEntity<AppealResponse> addAppeal(@RequestBody AppealRequest request){
        try{
            AppealResponse response = new AppealResponse();
            response.setAppealDto(appealService.addAppeal(request.getAppealDto()));
//            CustomerResponse response = new CustomerResponse();
//            response.setCustomerDto(appealService.addAppeal(request.getCustomerDto()));
            return ResponseEntity.ok(response);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
