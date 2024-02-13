package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorParameter {
    private GreetingsService greetingsService;
    public ConstructorParameter(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void greet(){
        this.greetingsService.sayGreeting();
    }
}
