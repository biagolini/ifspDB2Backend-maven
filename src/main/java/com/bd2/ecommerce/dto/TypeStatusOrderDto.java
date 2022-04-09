package com.bd2.ecommerce.dto;

import com.bd2.ecommerce.entity.TypeStatusOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeStatusOrderDto {

    private Long id;
    private String descriptionEn;
    private String descriptionPt;

    public TypeStatusOrderDto(TypeStatusOrder typeStatusOrder) {
        this.id = typeStatusOrder.getId();
        this.descriptionEn = typeStatusOrder.getDescriptionEn();
        this.descriptionPt = typeStatusOrder.getDescriptionPt();
    }
}
