package com.example.code.class9.xml;

import org.springframework.stereotype.Component;

@Component
public class XmlExample {
    public XmlExample() {
        System.out.println("Construct Example");
    }

    public void info() {
        System.out.println("Auto wiring example");
    }
}
