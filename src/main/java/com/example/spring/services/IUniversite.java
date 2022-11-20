package com.example.spring.services;

import com.example.spring.entites.Universite;
import com.example.spring.entites.Departement;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IUniversite {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (Long idUniv);

    void removeUniversite(Long idUniv);
    public void assignUniversiteToDepartement(Long idUniversite, Long idDepartement);
    public List<Departement> retrieveDepartementsByUniversite(Long idUniversite);
}
