package com.example.spring.services;

import com.example.spring.entites.Equipe;
import com.example.spring.entites.Projet;

import java.util.List;

public interface IProjet {
    List<Projet> retrieveAllProjet();

    Projet addProjet(Projet p);

    Projet updateProjet (Projet p);


    void removeProjet(Long idProjet);

}
