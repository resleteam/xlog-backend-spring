package com.resleteam.xlogbackendspring.services;

import java.util.UUID;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsService{

  public String getPost(UUID id){
    return "Hello World";
  }
}