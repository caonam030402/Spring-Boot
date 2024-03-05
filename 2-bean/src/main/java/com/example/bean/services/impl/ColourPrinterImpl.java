package com.example.bean.services.impl;


import com.example.bean.services.ColourPrinter;
import com.example.bean.services.RedPrinter;
import com.example.bean.services.BluePrinter;
import com.example.bean.services.GreenPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private final RedPrinter redPrinter;
    private final BluePrinter bluePrinter;
    private final GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
     }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
