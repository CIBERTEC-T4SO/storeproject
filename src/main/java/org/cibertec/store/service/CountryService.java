package org.cibertec.store.service;

import org.cibertec.store.entity.CountryEntity;
import org.cibertec.store.entity.ProveedorEntity;
import org.cibertec.store.repository.CountryRepository;
import org.cibertec.store.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** Servicio para manejar la lógica de negocio relacionada con los países.
 * Este servicio interactúa con el repositorio de países para realizar
 * operaciones CRUD y otras lógicas específicas del dominio.
 */
@Service
public class CountryService {

     @Autowired
     private CountryRepository repository;



    public List<CountryEntity> listarTodos() {
         return repository.findAll();
     }

}
