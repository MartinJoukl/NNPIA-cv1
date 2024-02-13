package com.martin.joukl.cv.controllers;

import com.martin.joukl.cv.services.ObiGreetingsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstancniPromennaTest {
    @Test
    void createAndGreetTest() {
        InstancniPromenna instancniPromenna = new InstancniPromenna();
        instancniPromenna.greet();
    }
}