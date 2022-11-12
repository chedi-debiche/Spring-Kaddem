package com.example.spring.repository;

import com.example.spring.entites.Departement;
import org.springframework.data.repository.CrudRepository;

public interface IDepartementRepository extends CrudRepository<Departement, Long> {
}
