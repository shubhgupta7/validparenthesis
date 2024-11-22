package com.Project.ValidParenthesis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class startController {
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }

}
