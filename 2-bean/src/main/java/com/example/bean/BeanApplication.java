package com.example.bean;


import com.example.bean.services.ColourPrinter;
import com.example.bean.services.impl.ColourPrinterImpl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class BeanApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
	}

	private ColourPrinter colourPrinter;

	public BeanApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	
	@Override
	public void run(final String... args) {
	
		System.out.println(colourPrinter.print());
	}
} 