package com.homeprojects.sample.services;

public class ColorPrinterImpl implements ColorPrinter {
    RedPrinter redPrinter;
    BluePrinter bluePrinter;

    public ColorPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
    }

    @Override
    public String print() {
        return String.join(",", redPrinter.print(), bluePrinter.print());
    }
}
