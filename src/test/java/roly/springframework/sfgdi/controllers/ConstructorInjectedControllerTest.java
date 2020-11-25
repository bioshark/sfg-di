package roly.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import roly.springframework.sfgdi.services.ConstructorGreetingService;

import static org.assertj.core.api.Assertions.assertThat;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void testContructorInjectedController() {
        System.out.println(controller.getGreeting());

        assertThat(controller.getGreeting()).isEqualTo("Hello World - Constructor!");
    }
}