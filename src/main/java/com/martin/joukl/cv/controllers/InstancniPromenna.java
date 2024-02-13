package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.GreetingsService;
import com.martin.joukl.cv.services.ObiGreetingsService;

public class InstancniPromenna {
    private GreetingsService greetingsService = new ObiGreetingsService();
    public void greet(){
        this.greetingsService.sayGreeting();
    }
}
