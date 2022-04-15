package com.bd2.ecommerce.controller;

import com.bd2.ecommerce.dto.CustomerDto;
import com.bd2.ecommerce.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
@AllArgsConstructor
public class CustomerController {

    private final ConversionService conversionService;

    private final CustomerService customerService;


    @GetMapping
    public @ResponseBody
    Page<CustomerDto> findAllPaginated(
            @RequestParam(required = false) String query,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String cpf,
            Pageable pageable
    ){
        if(query==null && firstName==null && lastName==null&& email==null&& cpf==null) { // Busca sem nenhum parametro
            return this.customerService
                    .findAll(pageable)
                    .map(entity -> this.conversionService.convert(entity, CustomerDto.class));

        } else if(query!=null && firstName==null && lastName==null&& email==null&& cpf==null ){ // Busca com uma query generica
            return this.customerService
                    .findAll(pageable,query)
                    .map(entity -> this.conversionService.convert(entity,CustomerDto.class));
        }
        return this.customerService // Busca com dados de perfil
                .findAll(pageable,firstName, lastName, email, cpf)
                .map(entity -> this.conversionService.convert(entity,CustomerDto.class));
        }

}
