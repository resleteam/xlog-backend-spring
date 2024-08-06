package com.resleteam.xlogbackendspring.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
  @GetMapping("/") //backendurl.com/
  public String getPost(@RequestParam UUID id){
    return "Hello World";
  }
  @DeleteMapping("/")
  public String deletePost(){
    return "Hello World";
  }
  @PostMapping("/")
  public String createPost(){
    return "Hello World";
  }
}