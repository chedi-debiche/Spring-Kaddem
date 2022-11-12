package com.example.spring.repository;

import com.example.spring.entites.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface IEtudiantRepositroy extends CrudRepository<Etudiant, Long> {
}
