package com.homeprojects.sample.config;

import com.homeprojects.sample.services.BluePrinter;
import com.homeprojects.sample.services.ColorPrinter;
import com.homeprojects.sample.services.RedPrinter;
import com.homeprojects.sample.services.impl.ColorPrinterImpl;
import com.homeprojects.sample.services.impl.EnglishBluePrinter;
import com.homeprojects.sample.services.impl.EnglishRedPrinter;
import com.homeprojects.sample.services.impl.TamilRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new TamilRedPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter){
        return new ColorPrinterImpl(redPrinter, bluePrinter);
    }

}
