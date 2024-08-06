package com.resleteam.xlogbackendspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
  @GetMapping("/") //backendurl.com/
  public String getPost(){
    return "Hello World";
  }
}