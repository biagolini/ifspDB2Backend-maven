package com.bd2.ecommerce.dto;

import com.bd2.ecommerce.entity.Order;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {

    private Long id;
    private Long idPrice;
    private Long idCustomer;
    private Long idTypeStatusOrder;
    private Long quantity;
    private String trackingCode;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.idPrice = order.getIdPrice();
        this.idCustomer = order.getIdCustomer();
        this.idTypeStatusOrder = order.getIdTypeStatusOrder();
        this.quantity = order.getQuantity();
        this.trackingCode = order.getTrackingCode();
    }
}

