package com.example.simpleauthdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api")
public class AuthController {

    @GetMapping(path = "/get")
    public String getValue() {
        return "Book";
    }

    @GetMapping(path = "/get-list")
    public List<String> getList() {
        return Arrays.asList("Book", "pen");
    }

}
