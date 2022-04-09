package com.bd2.ecommerce.service;


import com.bd2.ecommerce.dto.TypeGenreDto;
import com.bd2.ecommerce.dto.TypePlatformDto;
import com.bd2.ecommerce.dto.TypeStateDto;
import com.bd2.ecommerce.dto.TypeStatusOrderDto;
import com.bd2.ecommerce.entity.TypeGenre;
import com.bd2.ecommerce.entity.TypePlatform;
import com.bd2.ecommerce.entity.TypeState;
import com.bd2.ecommerce.entity.TypeStatusOrder;
import com.bd2.ecommerce.repository.TypeGenreRepository;
import com.bd2.ecommerce.repository.TypePlatformRepository;
import com.bd2.ecommerce.repository.TypeStateRepository;
import com.bd2.ecommerce.repository.TypeStatusOrderRepository;
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
    private final TypePlatformRepository typePlatformRepository;
    private final TypeStateRepository typeStateRepository;
    private final TypeStatusOrderRepository typeStatusOrderRepository;

    public List<TypeGenreDto> getGenre(){
        List<TypeGenre> listTypes = typeGenreRepository.findAll();

        if(listTypes.size()==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        List<TypeGenreDto> listReturn = new ArrayList<>();
        for (int i = 0; i < listTypes.size(); i++) {
            listReturn.add(new TypeGenreDto(listTypes.get(i) ));
        }
        return listReturn;
    }

    public List<TypePlatformDto> getPlatform(){
        List<TypePlatform> listTypes = typePlatformRepository.findAll();

        if(listTypes.size()==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        List<TypePlatformDto> listReturn = new ArrayList<>();
        for (int i = 0; i < listTypes.size(); i++) {
            listReturn.add(new TypePlatformDto(listTypes.get(i) ));
        }
        return listReturn;
    }

    public List<TypeStateDto> getState(){
        List<TypeState> listTypes = typeStateRepository.findAll();

        if(listTypes.size()==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        List<TypeStateDto> listReturn = new ArrayList<>();
        for (int i = 0; i < listTypes.size(); i++) {
            listReturn.add(new TypeStateDto(listTypes.get(i) ));
        }
        return listReturn;
    }

    public List<TypeStatusOrderDto> getStatusOrder(){
        List<TypeStatusOrder> listTypes = typeStatusOrderRepository.findAll();

        if(listTypes.size()==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        List<TypeStatusOrderDto> listReturn = new ArrayList<>();
        for (int i = 0; i < listTypes.size(); i++) {
            listReturn.add(new TypeStatusOrderDto(listTypes.get(i) ));
        }
        return listReturn;
    }

}
