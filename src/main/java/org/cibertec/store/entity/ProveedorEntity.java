package org.cibertec.store.entity;


import jakarta.persistence.*;

import lombok.Data;


@Data

@Entity

@Table(name = "PROVIDER")

public class ProveedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NUMDOC")
    private String doc;

    @Column(name = "NAME")
    private String nomre;

    @Column(name = "PHONE")
    private String telefono;

    @Column(name = "EMAIL")
    private String email;


}
