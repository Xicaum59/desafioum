package com.Xicaum59.services;

import org.springframework.stereotype.Service;

import com.Xicaum59.Entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		if (order.getBasicValue() < 100) {
			return 20;
		}
		else if (order.getBasicValue() > 100 && order.getBasicValue() < 200) {
			return 12;
		}
		else { 
			return 0;		
			
			
		}
		
	}

	

}
