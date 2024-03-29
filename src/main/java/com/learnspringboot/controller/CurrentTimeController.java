package com.learnspringboot.controller;

import com.learnspringboot.service.CurrentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentTimeController {

    @Autowired
    CurrentTimeService currentTimeService;

    @RequestMapping(value = "/getCurrentDateTime")
    public String getCurrentDateTime(){
        return currentTimeService.CurrentTimeController();
    }

}
