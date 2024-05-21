package com.tour.hotels.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class FirstController {
    @GetMapping("/hotel")
    public String firstHello() {
        return "Hotel ";
    }

    @GetMapping("/reserva")
    public String seconHello() {
        return "reserva";
    }
}
