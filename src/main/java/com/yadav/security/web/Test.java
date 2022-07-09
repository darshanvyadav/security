package com.yadav.security.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping(value = "/test")
    public String getApi(){
        return "lets check security";
    }

}
