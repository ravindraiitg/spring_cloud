package com.ravindra.configservertest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LuckywordController {

    @Value("${lucky-word}")
    String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is : " + this.luckyWord;
    }
}
