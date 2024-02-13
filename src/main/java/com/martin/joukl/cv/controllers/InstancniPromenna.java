package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.GreetingsService;
import com.martin.joukl.cv.services.ObiGreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class InstancniPromenna {
    @Autowired
    private GreetingsService greetingsService;
    public void greet(){
        this.greetingsService.sayGreeting();
    }
}
