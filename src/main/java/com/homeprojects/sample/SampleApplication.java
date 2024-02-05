package com.homeprojects.sample;

import com.homeprojects.sample.services.ColorPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	Logger LOGGER = Logger.getLogger(this.getClass().getName());
	private ColorPrinter colorPrinter;

	public SampleApplication(ColorPrinter colorPrinter){
		this.colorPrinter = colorPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(colorPrinter.print());
	}
}
