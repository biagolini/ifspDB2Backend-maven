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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCustomer")
    private Long id;

    @Column(name = "dsUsername")
    private String username;

    @Column(name = "dsFirstName")
    private String firstName;

    @Column(name = "dsLastName")
    private String lastName;

    @Column(name = "dsEmail")
    private String email;

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

