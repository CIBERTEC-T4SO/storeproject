package org.cibertec.store.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PROVEEDORES")
public class ProveedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "EMAIL")
    private String email;
}
