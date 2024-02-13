package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.ObiGreetingsService;
import org.junit.jupiter.api.Test;

class ConstructorParameterTest {
    @Test
    void createAndGreetTest() {
        ConstructorParameter constructorParameter = new ConstructorParameter(new ObiGreetingsService());
        constructorParameter.greet();
    }
}