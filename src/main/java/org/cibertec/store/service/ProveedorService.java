package org.cibertec.store.service;

import org.cibertec.store.entity.ProveedorEntity;
import org.cibertec.store.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar la logica de nogocio....
 */

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository repo;


    public List<ProveedorEntity> listarTodos() {
        return repo.findAll();
    }

    public void guardar(ProveedorEntity proveedor) {
        repo.save(proveedor);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }

    public ProveedorEntity buscarPorId(Integer id) {
        return repo.findById(id).orElse(new ProveedorEntity());
    }

}
