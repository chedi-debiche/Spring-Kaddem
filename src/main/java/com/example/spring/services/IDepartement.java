package com.example.spring.services;

import com.example.spring.entites.Departement;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public interface IDepartement {
    List<Departement> retrieveAllDepartement();

    Departement addDepartement(Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Long idDepart);

    void removeDepartement(Long idDepart);

    List<Departement> retrieveDepartementsByUniversite(Long idUniversite);

}
