package com.tolgaaksoy.franchiseApplication.controller;

import com.tolgaaksoy.franchiseApplication.request.CustomerRequest;
import com.tolgaaksoy.franchiseApplication.response.CustomerListResponse;
import com.tolgaaksoy.franchiseApplication.response.CustomerResponse;
import com.tolgaaksoy.franchiseApplication.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/addCustomer")
    public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerRequest request){
        try{
            CustomerResponse response = new CustomerResponse();
            response.setCustomerDto(customerService.addCustomer(request.getCustomerDto()));
            return ResponseEntity.ok(response);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/updateAppeal")
    public ResponseEntity<CustomerResponse> updateCustomer(@RequestBody CustomerRequest request){
        try{
            CustomerResponse response = new CustomerResponse();
            response.setCustomerDto(customerService.updateCustomer(request.getCustomerDto()));
            return ResponseEntity.ok(response);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteCustomer(@PathVariable(name = "id") long customerId) {
        try{
            customerService.deleteCustomer(customerId);
            return ResponseEntity.ok(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable(name = "id") long customerId){
        try{
            CustomerResponse response = new CustomerResponse();
            response.setCustomerDto(customerService.getCustomer(customerId));
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<CustomerListResponse> getCustomerList(){
        try{
            CustomerListResponse response = new CustomerListResponse();
            response.setCustomerDtoList(customerService.getCustomers());
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return  new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

}
