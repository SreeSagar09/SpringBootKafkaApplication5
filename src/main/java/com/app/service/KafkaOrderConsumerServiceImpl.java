package com.app.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.app.model.Order;

@Service
public class KafkaOrderConsumerServiceImpl implements KafkaOrderConsumerService {
	
	@KafkaListener(topics = "order-topic", groupId = "group-1")
	@Override
	public void processOrder1(Order order) {
		order.setOrderProcessedBy("processOrder1[group-1]");
		System.out.println(order);
	}
	
	@KafkaListener(topics = "order-topic", groupId = "group-1")
	@Override
	public void processOrder2(Order order) {
		order.setOrderProcessedBy("processOrder2[group-1]");
		System.out.println(order);
	}
	
	@KafkaListener(topics = "order-topic", groupId = "group-2")
	@Override
	public void processOrder3(Order order) {
		order.setOrderProcessedBy("processOrder3[group-2]");
		System.out.println(order);
	}
	
	@KafkaListener(topics = "order-topic", groupId = "group-2")
	@Override
	public void processOrder4(Order order) {
		order.setOrderProcessedBy("processOrder4[group-2]");
		System.out.println(order);
	}
}
