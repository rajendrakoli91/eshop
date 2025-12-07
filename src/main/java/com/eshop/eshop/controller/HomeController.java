package com.eshop.eshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
 //TODO 3 add swagger/ api-doc to access all apis
    @GetMapping("/")
    public String getMethod() {

            return("API is running");
}
}
