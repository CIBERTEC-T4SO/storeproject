package org.cibertec.store.service;

import org.cibertec.store.entity.CountryEntity;
import org.cibertec.store.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar la logica de nogocio....
 */

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;


    public List<CountryEntity> listarTodos() {
        return repo.findAll();
    }

//    public CountryEntity buscarPorId(Integer id) {    }
//    public void salvar(CountryEntity countryEntity) {}
//    public void eliminar (Integer id) {}

}
