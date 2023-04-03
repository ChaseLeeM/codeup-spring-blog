package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String returnLandingPage() {
        return "This is the landing page!";
    }

    private final EmailService emailService;

    public AdController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/")
    public String welcome() {
        emailService.prepareAndSend("test", "this is a test");
        System.out.println("Email sent");
        return "home";
    }

}