package com.bd2.ecommerce.dto;

import com.bd2.ecommerce.entity.Client;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ClientDto {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String cpf;
    private String street;
    private String number;
    private String city;
    private Long state;
    private String zip;

    public ClientDto( Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.birthDate = client.getBirthDate();
        this.cpf = client.getCpf();
        this.street = client.getStreet();
        this.number = client.getNumber();
        this.city = client.getCity();
        this.state = client.getState();
        this.zip = client.getZip();
    }
}
