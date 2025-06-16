package org.cibertec.store.repository;

import org.cibertec.store.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Integer> {

}
