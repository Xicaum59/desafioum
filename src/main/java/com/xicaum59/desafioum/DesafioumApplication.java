package com.xicaum59.desafioum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.xicaum59.entities.Order;
import com.xicaum59.services.OrderService;

@SpringBootApplication
@ComponentScan("com.xicaum59")

public class DesafioumApplication implements CommandLineRunner {
	
	
	
	@Autowired	
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioumApplication.class, args);
		
	}
	
	@Override	
	public void run(String...args) throws Exception {
		
		System.out.println();
		System.out.println("Entrada Pedido 1");
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor Basico:R$ " + String.format("%.2f", order1.getBasic()));
		System.out.println("Porcentagem do desconto: " + String.format("%.2f", order1.getDiscount()) + "%");
		System.out.println();
		double valorTotal1 = orderService.total(order1); 
		
		System.out.println("Saida pedido 1");
		System.out.println("Pedido código: " + order1.getCode());
		System.out.printf("Valor total:R$  " + String.format("%.2f", valorTotal1));
		System.out.println();
		
		System.out.println();
		
		System.out.println("Entrada Pedido 2");		
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor Basico:R$ " + String.format("%.2f", order2.getBasic()));
		System.out.println("Porcentagem do desconto: " + String.format("%.0f", order2.getDiscount()) + "%");
		System.out.println();
		double valorTotal2 = orderService.total(order2);
		
		System.out.println("Saida pedido 2");
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total:R$  " + String.format("%.2f", valorTotal2));
		System.out.println();
		
		
		System.out.println("Entrada Pedido 3");
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total:R$ " + String.format("%.2f", order3.getBasic()));
		System.out.println("Porcentagem do desconto: " + String.format("%.0f", order3.getDiscount()) + "%");
		System.out.println();
		double valorTotal3 = orderService.total(order3);
		
		System.out.println("Saida pedido 3");
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total:R$  " + String.format("%.2f", valorTotal3));
		System.out.println();
		
		
		
		
		
		
		
	
		
	}

}
