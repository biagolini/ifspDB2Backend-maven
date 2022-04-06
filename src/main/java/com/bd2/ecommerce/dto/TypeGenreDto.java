package com.bd2.ecommerce.dto;

import com.bd2.ecommerce.entity.TypeGenre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeGenreDto {

    private Long id;
    private String descriptionEn;
    private String descriptionPt;
    private Boolean isActive;


    public TypeGenreDto(TypeGenre typeGenre) {
        this.id = typeGenre.getId();
        this.descriptionEn = typeGenre.getDescriptionEn();
        this.descriptionPt = typeGenre.getDescriptionPt();
        this.isActive = typeGenre.getIsActive();
    }
}
