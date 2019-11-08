package com.learnspringboot.service;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CurrentTimeService {

    @Autowired
    Environment env;

    public String CurrentTimeController(){
        LocalDateTime localDateTime = LocalDateTime.now();
        String message = env.getProperty("message");
        return message.concat(localDateTime.toString());
    }
}
