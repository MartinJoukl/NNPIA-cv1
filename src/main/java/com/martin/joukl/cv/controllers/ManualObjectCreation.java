package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.GreetingsService;
import com.martin.joukl.cv.services.ObiGreetingsService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class ManualObjectCreation {
    private GreetingsService greetingsService;

    public ManualObjectCreation() {
        this.greetingsService = new ObiGreetingsService();
    }

    public void greet(){
        this.greetingsService.sayGreeting();
    }
}
