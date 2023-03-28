package com.codeup.codeupspringblog.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String returnDiceView() {
        return "dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String returnGuessResult(@PathVariable int n, Model model) {
        int random = ThreadLocalRandom.current().nextInt(1, 6 + 1);;
        model.addAttribute("guess", n);
        model.addAttribute("answer", random);
        return "dice-results";
    }

}