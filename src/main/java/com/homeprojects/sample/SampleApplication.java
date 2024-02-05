package com.homeprojects.sample;

import com.homeprojects.sample.services.ColorPrinter;
import com.homeprojects.sample.services.ColorPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
@Log
public class SampleApplication implements CommandLineRunner {

	Logger logger = Logger.getLogger(this.getClass().getName());
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final ColorPrinter colorPrinter = new ColorPrinterImpl();
		logger.info(colorPrinter.print());
	}
}
