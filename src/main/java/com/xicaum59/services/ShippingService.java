package com.xicaum59.services;

import org.springframework.stereotype.Service;

import com.xicaum59.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double basicValue = order.getBasic();
		
		if (basicValue < 100.0) {
			return 20.00;
		}
		else if (basicValue >= 100.00 && basicValue < 200.00) {
			return 12.00;
		}
		else {
			return 0.0;
		}
	}

}
