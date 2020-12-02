package roly.springframework.sfgdi.services.language;

import roly.springframework.sfgdi.services.GreetingService;

public class PrimarySpanishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
