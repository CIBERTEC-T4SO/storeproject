package org.cibertec.store.service;

import org.cibertec.store.entity.ProveedorEntity;
import org.cibertec.store.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar la lógica de negocio relacionada con los proveedores.
 * Proporciona métodos para obtener, guardar y eliminar proveedores.
 */
@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    /**
     * Lista todos los proveedores
     * *@return Lista de proveedores
     * @return
     */
    public List<ProveedorEntity> getAll() {
        return proveedorRepository.findAll();
    }

    public ProveedorEntity getById(Integer id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    public ProveedorEntity save(ProveedorEntity proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void delete(Integer id) {
        proveedorRepository.deleteById(id);
    }

}
