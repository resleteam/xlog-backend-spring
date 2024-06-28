package com.resleteam.xlogbackendspring.services;
import org.springframework.stereotype.Service;

@Service
public class PingService {
  public String ping(){
    int i = 1;
    if(i>1){
      return "ping";
    } else {
      return "non ping";
    }
  }
}