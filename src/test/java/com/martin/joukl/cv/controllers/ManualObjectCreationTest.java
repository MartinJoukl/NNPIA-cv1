package com.martin.joukl.cv.controllers;

import org.junit.jupiter.api.Test;

class ManualObjectCreationTest {
    @Test
    void createAndGreetTest() {
        ManualObjectCreation manualObjectCreation = new ManualObjectCreation();
        manualObjectCreation.greet();
    }
}