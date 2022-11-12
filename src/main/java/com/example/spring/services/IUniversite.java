package com.example.spring.services;

import com.example.spring.entites.Universite;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IUniversite {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (Long idUniv);

    void removeUniversite(Long idUniv);
}
