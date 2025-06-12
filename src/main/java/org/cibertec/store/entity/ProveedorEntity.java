package org.cibertec.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="PROVIDER")
public class ProveedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="NUMDOC")
    private String doc;

    @Column(name="NAME")
    private String nombre;

    @Column(name="PHONE")
    private String telefono;

    @Column(name="EMAIL")
    private String email;
}
