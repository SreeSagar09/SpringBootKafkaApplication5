package com.app.service;

import com.app.model.Order;

public interface KafkaOrderConsumerService {
	public void processOrder1(Order order);
	public void processOrder2(Order order);
	public void processOrder3(Order order);
	public void processOrder4(Order order);
}
