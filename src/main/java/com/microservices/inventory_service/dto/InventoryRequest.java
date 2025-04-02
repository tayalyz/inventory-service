package com.microservices.inventory_service.dto;

import java.math.BigDecimal;

public record InventoryRequest(Long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {
}
