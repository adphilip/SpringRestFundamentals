package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


  @GetMapping("/message")
  Message send() {
    return new Message("first message with java 11 and 8");
  }

  @PostMapping("/message")
  Message echo (@RequestBody Message message) {
    return message;
  }


}
