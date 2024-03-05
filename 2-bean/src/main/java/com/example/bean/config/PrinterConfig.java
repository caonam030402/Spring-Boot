package com.example.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bean.services.BluePrinter;
import com.example.bean.services.ColourPrinter;
import com.example.bean.services.GreenPrinter;
import com.example.bean.services.RedPrinter;
import com.example.bean.services.impl.ColourPrinterImpl;
import com.example.bean.services.impl.EnglishBluePrinter;
import com.example.bean.services.impl.EnglishGreenPrinter;
import com.example.bean.services.impl.EnglishRedPrinter;

@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }
    
    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }
    
    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter,greenPrinter);
    }
}
