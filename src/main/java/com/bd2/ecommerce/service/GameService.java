package com.bd2.ecommerce.service;


import com.bd2.ecommerce.dto.HighlightDto;
import com.bd2.ecommerce.entity.Customer;
import com.bd2.ecommerce.entity.Game;
import com.bd2.ecommerce.entity.Highlight;
import com.bd2.ecommerce.repository.GameRepository;
import com.bd2.ecommerce.repository.HighlightRepository;
import com.bd2.ecommerce.repository.specifications.CustomerSpecification;
import com.bd2.ecommerce.repository.specifications.GameSpecification;
import com.bd2.ecommerce.repository.specifications.HighlightSpecification;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class GameService {

    private final GameRepository gameRepository;

    private final HighlightRepository highlightRepository;

    public Page<Game> findAll(Pageable pageable) {
        return this.gameRepository.findAll(GameSpecification.isActive(),pageable);
    }

    public Page<Game> findAll(Pageable pageable, String name, Long genre) {
        return this.gameRepository.findAll(GameSpecification.likeDescription(name, genre),pageable);
    }

    public Page<Highlight> findHighlight(Pageable pageable) {
        return this.highlightRepository.findAll(HighlightSpecification.isActive(),pageable);
    }

}
