package com.example.spring.repository;

import com.example.spring.entites.DetailEquipe;
import com.example.spring.entites.Equipe;
import org.springframework.data.repository.CrudRepository;

public interface IDetailequipeRepository extends CrudRepository<DetailEquipe, Long> {
}
