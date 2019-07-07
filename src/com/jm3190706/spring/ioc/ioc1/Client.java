package com.jm3190706.spring.ioc.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car = context.getBean(Car.class, "myCar");
		car.drive();
	}
}
