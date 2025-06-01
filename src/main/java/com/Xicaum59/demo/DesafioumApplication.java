package com.Xicaum59.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Xicaum59.Entities.Order;
import com.Xicaum59.services.OrderService;

@SpringBootApplication

public class DesafioumApplication implements CommandLineRunner{
	
	
	
	OrderService orderService = new OrderService();
	private Order Order;

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(DesafioumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		double result = orderService.total(Order);
		System.out.println(result);
		
		
	}
	
	

}
