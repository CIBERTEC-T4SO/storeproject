package org.cibertec.store.repository;

import org.cibertec.store.entity.ProveedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// Extender de JpaRepository para manejar la entidad Proveedor
// Cambiar class a interface para que sea un repositorio, class solamente es para entidades
// Agregar el tipo de entidad y el tipo de clave primaria<Proveedor, Integer>

public interface ProveedorRepository extends JpaRepository<ProveedorEntity,Integer> {

}
