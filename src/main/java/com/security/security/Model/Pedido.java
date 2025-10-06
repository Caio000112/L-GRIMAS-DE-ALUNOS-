package com.security.security.Model;

import jakarta.persistence.*;

@Table(name = "tbl_order")
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


}


