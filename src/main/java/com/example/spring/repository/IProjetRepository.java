package com.example.spring.repository;

import com.example.spring.entites.Equipe;
import com.example.spring.entites.Projet;
import org.springframework.data.repository.CrudRepository;

public interface IProjetRepository extends CrudRepository<Projet, Long> {
}
