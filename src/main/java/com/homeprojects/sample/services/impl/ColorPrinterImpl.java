package com.homeprojects.sample.services.impl;

import com.homeprojects.sample.services.BluePrinter;
import com.homeprojects.sample.services.ColorPrinter;
import com.homeprojects.sample.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {
    RedPrinter redPrinter;
    BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(",", redPrinter.print(), bluePrinter.print());
    }
}
