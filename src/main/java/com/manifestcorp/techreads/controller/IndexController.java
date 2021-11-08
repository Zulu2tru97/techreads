package com.manifestcorp.techreads.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String read() {
        return "Hello";
    }
}
