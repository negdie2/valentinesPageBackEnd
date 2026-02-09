package com.negdie.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Diego Cuevas
 **/

@RestController
public class mainController {
    @GetMapping("/")
    public String hello() {
        return "Spring Boot funcionando en Railway";
    }
}
