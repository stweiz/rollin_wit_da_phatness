package org.stweiz.rollin_wit_da_phatness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginPage {

    private static final String ENDPOINT = "/";

    @GetMapping(ENDPOINT)
    public String hello() {
        return "hello";
    }
}
