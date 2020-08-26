package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payloads")
@RequiredArgsConstructor
public class PayloadController {
    public final PayloadRepository payloadRepository;

    @GetMapping
    public EntityModel<Payload> getPayload() {
        return EntityModel.of(payloadRepository.findAll().stream().findFirst().get());

    }
}
