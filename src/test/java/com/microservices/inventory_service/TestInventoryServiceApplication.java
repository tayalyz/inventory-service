package com.microservices.inventory_service;

import org.springframework.boot.SpringApplication;

public class TestInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryServiceApplication::main).with(TestInventoryServiceApplication.class).run(args);
	}

}
