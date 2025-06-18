package org.cibertec.store.service.impl;

import org.cibertec.store.entity.CountryEntity;
import org.cibertec.store.service.CountryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends GenericServiceImpl<CountryEntity, Integer> implements CountryService{
    public CountryServiceImpl(JpaRepository<CountryEntity, Integer> repository) {
        this.repository = repository;
    }
}
