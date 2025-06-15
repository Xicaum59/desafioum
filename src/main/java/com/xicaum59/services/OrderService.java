package com.xicaum59.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService ;
		
		public double total(com.xicaum59.entities.Order order) {
			double discountAmount = order.getBasic() * (order.getDiscount() / 100.00);
			double orderAfterDiscount = order.getBasic() - discountAmount;
			double shippingCost = shippingService.shipment(order);
			return orderAfterDiscount + shippingCost;
			
			
			
			}
			public OrderService() {
				
			}
			public ShippingService getShippingService() {
				return shippingService;
			}
			public void setShippingService(ShippingService shippingService) {
				this.shippingService = shippingService;
			}
			
		}
	
	
