package com.resleteam.xlogbackendspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resleteam.xlogbackendspring.services.PingService;

@RestController
public class PingController {
    PingService pingService = new PingService();
    
    @GetMapping("/ping")
    public String ping(){
        try{
            return pingService.ping();
        } catch (Exception e){
            e.printStackTrace();
            return "Hello world";
        }
    }
    @GetMapping("/ping")
    public String pin(){
        return pingService.ping();
    }
    @GetMapping("/ping")
    public String png(){
        return pingService.ping();
    }
}