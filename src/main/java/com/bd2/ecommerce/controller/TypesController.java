package com.bd2.ecommerce.controller;

import com.bd2.ecommerce.dto.TypeGenreDto;
import com.bd2.ecommerce.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/types")
@AllArgsConstructor
public class TypesController {

    private final TypeService typeService;

    @GetMapping("/getGenre")
    public ResponseEntity<?> getGenre() {
        List<TypeGenreDto> response = this.typeService.getGenre();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
