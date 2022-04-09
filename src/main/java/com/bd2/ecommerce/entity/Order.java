package com.bd2.ecommerce.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tblorder")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorder")
    private Long id;

    @Column(name = "idprice")
    private Long idPrice;

    @Column(name = "idclient")
    private Long idClient;

    @Column(name = "idtypestatusorder")
    private Long idTypeStatusOrder;

    @Column(name = "dsquantity")
    private Long quantity;

    @Column(name = "dstrackingcode")
    private String trackingCode;

    @Column(name = "stactive")
    private Boolean isActive;

}

