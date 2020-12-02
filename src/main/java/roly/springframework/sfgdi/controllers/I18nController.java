package roly.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import roly.springframework.sfgdi.services.GreetingService;

//@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
