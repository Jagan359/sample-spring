package com.homeprojects.sample.services.impl;

import com.homeprojects.sample.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class TamilRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Sigapu";
    }
}
