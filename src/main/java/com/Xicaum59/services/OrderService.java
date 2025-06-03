package com.Xicaum59.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Xicaum59.Entities.Order;

@Service
public class OrderService extends Order {
	
	
	
	
	public OrderService(Integer code, double basicValue, double discount) {
		super(code, basicValue, discount);
		
	}

	@Autowired
	public double total (Order order) {
		double discount = order.getBasicValue() * order.getDiscount()/100;
		return (order.getBasicValue() - discount);
	
	}

}
