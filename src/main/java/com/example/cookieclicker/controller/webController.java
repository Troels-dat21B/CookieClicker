package com.example.cookieclicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {


    @GetMapping("/")
    public String game(){
        return "game";
    }



}
