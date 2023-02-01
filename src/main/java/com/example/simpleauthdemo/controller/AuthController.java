package com.example.simpleauthdemo.controller;

import io.jsonwebtoken.Claims;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api")
public class AuthController {

    @GetMapping(path = "/get-one")
    public String getValue(HttpServletRequest request) {
        Claims claim = (Claims) request.getAttribute("info");
        System.out.println("Name:" + claim.get("name"));
        System.out.println("Id:" + claim.get("id"));
        System.out.println("Validated:" + claim.get("validated"));
        return "Book";
    }

    @GetMapping(path = "/get-list")
    public List<String> getList(HttpServletRequest request) {
        Claims claim = (Claims) request.getAttribute("info");
        System.out.println("Name: " + claim.get("name"));
        System.out.println("Id: " + claim.get("id"));
        System.out.println("Validated: " + claim.get("validated"));
        return Arrays.asList("Book", "pen");
    }

}
