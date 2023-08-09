package com.shm.SHMManagement.controller;

import com.shm.SHMManagement.service.SandeepService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandeepController {

    @Autowired
    SandeepService sandeepService;

    @GetMapping(value = "/{name}")
    public String getGreetingsByName(
            @PathVariable
            String name) {
        System.out.println("greeting method processed");
        return sandeepService.greetingMessage(name);
    }
}
