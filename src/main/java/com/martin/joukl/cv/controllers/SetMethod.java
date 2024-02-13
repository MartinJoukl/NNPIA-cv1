package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.GreetingsService;

public class SetMethod {

    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void greet(){
        this.greetingsService.sayGreeting();
    }
}
