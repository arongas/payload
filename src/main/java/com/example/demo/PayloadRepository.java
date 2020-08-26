package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PayloadRepository extends JpaRepository<Payload, UUID> {
}
