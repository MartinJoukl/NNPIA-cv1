package com.martin.joukl.cv.services;

import org.springframework.stereotype.Service;
@Service
public class ObiGreetingsService implements GreetingsService {

    @Override
    public void sayGreeting() {
        System.out.println("Oh, hello there.");
    }
}
