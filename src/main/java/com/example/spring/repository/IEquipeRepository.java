package com.example.spring.repository;

import com.example.spring.entites.Equipe;
import org.springframework.data.repository.CrudRepository;

public interface IEquipeRepository extends CrudRepository<Equipe, Long> {
}
