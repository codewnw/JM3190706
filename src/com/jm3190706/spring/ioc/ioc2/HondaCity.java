package com.jm3190706.spring.ioc.ioc2;

import org.springframework.stereotype.Component;

@Component("hondaCity")
public class HondaCity implements Car {

	@Override
	public void drive() {
		System.out.println("Driving honda city...");
	}

}
