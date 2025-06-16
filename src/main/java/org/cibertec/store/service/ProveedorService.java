package org.cibertec.store.service;

import org.cibertec.store.entity.ProveedorEntity;
import org.cibertec.store.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Se pone la anotación @Service para que Spring lo reconozca como un servicio
@Service
public class ProveedorService {

    // Inyectamos/instanciamos el repositorio ProveedorRepository para poder acceder a los métodos de acceso a datos
    // Se pone la anotación @Autowired para que Spring inyecte el repositorio
    // y evita que tengamos que crear una instancia manualmente con new ProveedorRepository()
    // y todos sus métodos ya están implementados por defecto
    @Autowired
    private ProveedorRepository proveedorRepository;


    // Añadimos metodo para listar todos los proveedores y toda la lógica de negocio como
    // por ejemplo validaciones, transformaciones, etc.

    // .finAll() sirve para listar todos los registros de la tabla
    public List<ProveedorEntity> ListarTodos() {
        return proveedorRepository.findAll();
    }



}
