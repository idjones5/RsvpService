package com.twou.rsvp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // controller

    @RequestMapping(value = "/")

    public String index() {
        return "";
    }
}
