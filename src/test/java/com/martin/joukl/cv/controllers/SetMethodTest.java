package com.martin.joukl.cv.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetMethodTest {
    @Autowired
    SetMethod setMethod;
    @Test
    void createAndGreetTest() {
        setMethod.greet();
    }
}