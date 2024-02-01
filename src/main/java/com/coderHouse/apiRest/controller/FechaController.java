package com.coderHouse.apiRest.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaController {
    @GetMapping("/calcularfecha")
    public String getFechaDeHoy() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        return "Fecha y hora actuales: " + formattedDateTime;
    }
}
