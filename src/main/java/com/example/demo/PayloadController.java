package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payloads")
@RequiredArgsConstructor
public class PayloadController {
    public final PayloadRepository payloadRepository;




    @GetMapping
    public Resource<Payload> getPayload(){
        return new Resource<>(payloadRepository.findAll().stream().findFirst().get());

    }
}
