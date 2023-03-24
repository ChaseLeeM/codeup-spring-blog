package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/hello")
    @ResponseBody
    public String HelloWorld(@RequestParam(defaultValue = "true") boolean uppercase) {
        if (uppercase) {
            return "HELLO WORLD!";
        } else {
            return "Hello, World!";
        }
    }

    @GetMapping("/hello/{fname}/{lname}")
    @ResponseBody
    public String helloWithName(@PathVariable String fname, @PathVariable String lname) {
        return "Hello, " + fname + " " + lname + "!";
    }


}
