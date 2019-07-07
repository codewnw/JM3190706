package com.jm3190706.spring.ioc.ioc2;

import org.springframework.stereotype.Component;

@Component(value="hondaAmaze")
public class HondaAmaze implements Car {

	@Override
	public void drive() {
		System.out.println("Driving hona amaze...");
	}

}
