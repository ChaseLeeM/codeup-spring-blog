package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    public HomeController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/")
    @ResponseBody
    public String returnLandingPage() {
        return "This is the landing page!";
    }

    private EmailService emailService;

    public void AdController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/")
    public String welcome() {
        emailService.prepareAndSend("test", "this is a test");
        System.out.println("Email sent");
        return "home";
    }

}