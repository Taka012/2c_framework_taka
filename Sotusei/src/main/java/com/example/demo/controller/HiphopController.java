package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HiphopController {
 
    @GetMapping("/hiphop")
    public String showKeijibanPage() {
        return "hiphop";
    }
}