package com.martin.joukl.cv.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorParameterTest {
    @Autowired
    ConstructorParameter constructorParameter;
    @Test
    void createAndGreetTest() {
        constructorParameter.greet();
    }
}