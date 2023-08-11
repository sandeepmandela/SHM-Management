package com.shm.SHMManagement.controller;

import com.shm.SHMManagement.service.SandeepService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@AllArgsConstructor
public class SandeepController {

    @Autowired
    SandeepService sandeepService;

    @GetMapping(value = "/{name}")
    public String getGreetingsByName(
            @PathVariable
            @NotNull
            @Size(min = 3, max = 20, message = "Invalid name")
            String name,

            @RequestHeader
            @NotNull
            @Size(min = 5, max = 10, message = "Invalid sam size")
            Long number
    ) {
        System.out.println("greeting method processed");
        return sandeepService.greetingMessage(name);
    }
}
