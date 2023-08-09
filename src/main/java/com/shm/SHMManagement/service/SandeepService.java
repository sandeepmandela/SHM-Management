package com.shm.SHMManagement.service;

import org.springframework.stereotype.Service;

@Service
public class SandeepService {
    public String greetingMessage(String name){
        System.out.println("Entered greetingMessage");
        StringBuilder greeting_builder = new StringBuilder();
        greeting_builder.append("Hello " + name);
        return greeting_builder.toString();
    }

}
