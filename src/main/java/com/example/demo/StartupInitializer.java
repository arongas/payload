package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartupInitializer implements CommandLineRunner {
    public final PayloadRepository payloadRepository;
    @Override
    public void run(String... args) throws Exception {
        Payload payload=new Payload();
        payload.setMode("mode");
        payloadRepository.save(payload);
    }
}

