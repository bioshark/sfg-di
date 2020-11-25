package roly.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import roly.springframework.sfgdi.services.GreetingServiceImplementation;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    void testSetterInjectedController() {
        System.out.println(controller.getGreeting());
    }
}