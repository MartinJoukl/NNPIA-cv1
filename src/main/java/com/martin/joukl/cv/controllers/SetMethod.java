package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetMethod {

    private GreetingsService greetingsService;
    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void greet(){
        this.greetingsService.sayGreeting();
    }
}
