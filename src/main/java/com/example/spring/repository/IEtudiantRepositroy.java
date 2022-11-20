package com.example.spring.repository;

import com.example.spring.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IEtudiantRepositroy extends CrudRepository<Etudiant, Long> {

    Etudiant findEtudiantByprenomE(String prenomE);


}
