package com.suyoga.suyoga.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class HelloWorldController {
    @RequestMapping("/suyoga/hello")
    public String index(){
        return "hello world";
    }

}
