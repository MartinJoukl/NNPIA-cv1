package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.GreetingsService;

public class ConstructorParameter {
    private GreetingsService greetingsService;
    public ConstructorParameter(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void greet(){
        this.greetingsService.sayGreeting();
    }
}
