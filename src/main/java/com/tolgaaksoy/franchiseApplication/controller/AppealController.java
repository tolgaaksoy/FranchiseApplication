package com.tolgaaksoy.franchiseApplication.controller;

import com.tolgaaksoy.franchiseApplication.request.AppealRequest;
import com.tolgaaksoy.franchiseApplication.response.AppealListResponse;
import com.tolgaaksoy.franchiseApplication.response.AppealResponse;
import com.tolgaaksoy.franchiseApplication.services.AppealServiceImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("api/appeal")
public class AppealController {

    @Autowired
    private final AppealServiceImpl appealService;

    @PostMapping("/addAppeal")
    public ResponseEntity<AppealResponse> addAppeal(@RequestBody AppealRequest request){
        try{
            AppealResponse response = new AppealResponse();
            response.setAppealDto(appealService.addAppeal(request.getAppealDto()));
            return ResponseEntity.ok(response);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteAppeal(@PathVariable(name = "id") long appealId) {
        try{
            appealService.deleteAppeal(appealId);
            return ResponseEntity.ok(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<AppealResponse> getAppeal(@PathVariable(name = "id") long appealId) {
        try{
            AppealResponse response = new AppealResponse();
            response.setAppealDto(appealService.getAppeal(appealId));
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<AppealListResponse> getAppealList(){
        try{
            AppealListResponse response = new AppealListResponse();
            response.setAppealDtoList(appealService.getAppealList());
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
