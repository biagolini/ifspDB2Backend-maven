package com.bd2.ecommerce.service;


import com.bd2.ecommerce.dto.TypeGenreDto;
import com.bd2.ecommerce.entity.TypeGenre;
import com.bd2.ecommerce.repository.TypeGenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class TypeService {

    private final TypeGenreRepository typeGenreRepository;

    public List<TypeGenreDto> getGenre(){
        List<TypeGenre> listTypes = typeGenreRepository.findAllTypes();

        if(listTypes.size()==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        List<TypeGenreDto> listReturn = new ArrayList<>();
        for (int i = 0; i < listTypes.size(); i++) {
            listReturn.add(new TypeGenreDto(listTypes.get(i) ));
        }
        return listReturn;
    }
}
