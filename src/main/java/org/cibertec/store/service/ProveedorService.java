package org.cibertec.store.service;

import org.cibertec.store.entity.ProveedorEntity;
import org.cibertec.store.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** Servicio para manejar la lógica de negocio relacionada con los proveedores.
 * Este servicio interactúa con el repositorio de proveedores para realizar
 * operaciones CRUD y otras lógicas específicas del dominio.
 */
@Service
public class ProveedorService {

     @Autowired
     private ProveedorRepository repository;



      public List<ProveedorEntity> listarTodos() {
         return repository.findAll();
     }

     /** Guardar un proveedor en la base de datos.
      * @param proveedor El proveedor a guardar.
      */
     public void guardar(ProveedorEntity proveedor) {
         repository.save(proveedor);
     }


     public ProveedorEntity buscarPorId(Integer id) {

         return repository.findById(id).orElse(new ProveedorEntity());
         //.orElse(new ProveedorEntity());

     }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

}
