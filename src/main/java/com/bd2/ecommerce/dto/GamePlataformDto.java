package com.bd2.ecommerce.dto;

import com.bd2.ecommerce.entity.GamePlataform;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GamePlataformDto {

    private Long id;
    private Long game;
    private Boolean isVideo;
    private String url;

    public GamePlataformDto(GamePlataform gamePlataform) {
        this.id = gamePlataform.getId();
        this.game = gamePlataform.getGame();
        this.isVideo = gamePlataform.getIsVideo();
        this.url = gamePlataform.getUrl();
    }
}
