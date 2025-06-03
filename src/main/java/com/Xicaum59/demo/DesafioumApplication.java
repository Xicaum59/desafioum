package com.Xicaum59.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Xicaum59.Entities.Order;
import com.Xicaum59.services.OrderService;


@SpringBootApplication
public class DesafioumApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(DesafioumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		Order order = new Order(1034, 150.0, 20.0);
		double result = orderService.total(order);
		System.out.println(result);
		
		
	}
	
	

}
