package com.homeprojects.sample.services.impl;

import com.homeprojects.sample.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Blue";
    }
}
