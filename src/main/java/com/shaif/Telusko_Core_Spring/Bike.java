package com.shaif.Telusko_Core_Spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("bhaag rha hai..");
	}
}
