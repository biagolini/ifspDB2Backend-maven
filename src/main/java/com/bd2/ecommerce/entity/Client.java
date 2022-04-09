package com.bd2.ecommerce.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tblclient")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclient")
    private Long id;

    @Column(name = "dsname")
    private String name;

    @Column(name = "dsbirthdate")
    private LocalDate birthDate;

    @Column(name = "dscpf")
    private String cpf;

    @Column(name = "dsstreet")
    private String street;

    @Column(name = "dsnumber")
    private String number;

    @Column(name = "dscity")
    private String city;

    @Column(name = "idtypestate")
    private Long state;

    @Column(name = "dszip")
    private String zip;

    @Column(name = "stactive")
    private Boolean isActive;

}

