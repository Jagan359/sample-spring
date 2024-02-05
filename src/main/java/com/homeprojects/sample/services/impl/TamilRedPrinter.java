package com.homeprojects.sample.services.impl;

import com.homeprojects.sample.services.RedPrinter;
import org.springframework.stereotype.Service;

@Service
public class TamilRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Sigapu";
    }
}
