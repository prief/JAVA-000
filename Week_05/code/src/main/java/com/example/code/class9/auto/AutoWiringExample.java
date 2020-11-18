package com.example.code.class9.auto;

import org.springframework.stereotype.Component;

@Component
public class AutoWiringExample {
    public AutoWiringExample() {
        System.out.println("Construct Example");
    }

    public void info() {
        System.out.println("Auto wiring example");
    }
}
