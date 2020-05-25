package com.leogorman.restapi.controller;

import com.leogorman.restapi.model.Mortgage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@RestController
public class MortgageController {
    private static final Mortgage[] mortgages = {
            new Mortgage(1, 1, 0.05, 100000.0, 400000.0),
            new Mortgage(2, 2, 0.05, 50000.0, 300000.0),
            new Mortgage(3, 1, 0.05, 150000.0, 150000.0)
    };

    @GetMapping("/mortgages")
    public Mortgage[] mortgages() {
        return mortgages;
    }

    @GetMapping("/mortgages/{userId}")
    public Mortgage mortgage(@PathVariable int userId) {
        for (Mortgage mortgage : mortgages) {
            if (mortgage.getUserId() == userId) {
                return mortgage;
            }

        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "User not found"
        );
    }
}

