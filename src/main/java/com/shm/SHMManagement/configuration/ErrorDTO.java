package com.shm.SHMManagement.configuration;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class ErrorDTO {
    private Date timestamp;
    private int status;
    private String path;
    private List<String> errors = new ArrayList<>();

    public void addError(String message) {
        this.errors.add(message);
    }

    // getters and setters are not shown
}