package com.example.spring.services;
import com.example.spring.entites.Universite;
import com.example.spring.repository.IDepartementRepository;
import com.example.spring.repository.IUniversiteRepository;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Departement;

import java.util.ArrayList;
import java.util.List;
import com.example.spring.repository.IEtudiantRepositroy;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartementService implements  IDepartement{
   private final IDepartementRepository departementRepository;
    @Override
     public List<Departement> retrieveAllDepartement() {
       return (List<Departement>) departementRepository.findAll();
   }
    @Override
    public Departement addDepartement(Departement d) {
        return  departementRepository.save(d);
    }
    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }
    @Override
    public Departement retrieveDepartement(Long idDepart) {
        return departementRepository.findById(Long.valueOf(idDepart)).get();

    }

    @Override
    public void removeDepartement(Long idDepart) {
        departementRepository.deleteById(idDepart);
    }

    
}
