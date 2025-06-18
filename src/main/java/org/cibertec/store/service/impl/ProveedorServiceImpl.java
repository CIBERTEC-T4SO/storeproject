package org.cibertec.store.service.impl;

import org.cibertec.store.entity.ProveedorEntity;
import org.cibertec.store.service.ProveedorService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl extends GenericServiceImpl<ProveedorEntity, Integer> implements ProveedorService {
    public ProveedorServiceImpl(JpaRepository<ProveedorEntity, Integer> repository) {
        this.repository = repository;
    }

}
