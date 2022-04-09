package com.bd2.ecommerce.dto;

import com.bd2.ecommerce.entity.Highlight;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class HighlightDto {

    private Long id;
    private Long game;
    private LocalDate publicationDate;

    public HighlightDto(Highlight highlight) {
        this.id = highlight.getId();
        this.game = highlight.getGame();
        this.publicationDate = highlight.getPublicationDate();
    }
}
