package com.example.spring.repository;

import com.example.spring.entites.Universite;
import org.springframework.data.repository.CrudRepository;

public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
}
