package com.example.testranti.controller;

import com.example.testranti.dto.BaseInputDto;
import com.example.testranti.dto.BaseOutputDto;
import com.example.testranti.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "/ganjil")
    public BaseOutputDto generateGanjil(@RequestBody BaseInputDto request){
        return testService.generateGanjil(request);
    }

    @GetMapping(value = "/genap")
    public BaseOutputDto generateGenap(@RequestBody BaseInputDto request){
        return testService.generateGenap(request);
    }

}
