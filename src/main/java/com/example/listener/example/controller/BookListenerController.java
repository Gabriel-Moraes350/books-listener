package com.example.listener.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("listener")
public class BookListenerController {

    @GetMapping
    public String chat(){
        return "chat";
    }

    @GetMapping("teste")
    public String teste(){
        return "teste";
    }
}
