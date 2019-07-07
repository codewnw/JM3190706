package com.jm3190706.spring.ioc.ioc1;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {
	public void drive() {
		System.out.println("Driving the car...");
	}
}
