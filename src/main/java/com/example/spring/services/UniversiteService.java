package com.example.spring.services;
import com.example.spring.entites.Departement;
import com.example.spring.repository.IDepartementRepository;
import com.example.spring.repository.IEtudiantRepositroy;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Universite;
import com.example.spring.repository.IUniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversite{
    @Autowired
    private  IUniversiteRepository universiteRepository;
    @Autowired
    private  IDepartementRepository departementRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return (List<Universite>) universiteRepository.findAll();
    }
    @Override
    public Universite addUniversite(Universite u) {
        return  universiteRepository.save(u);
    }
    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }
    @Override
    public Universite retrieveUniversite(Long idUniv) {
        return universiteRepository.findById(Long.valueOf(idUniv)).get();

    }

    @Override
    public void removeUniversite(Long idUniv) {
        universiteRepository.deleteById(idUniv);
    }
    @Override
    public void assignUniversiteToDepartement(Long idUniversite, Long idDepartement) {
        Universite universite= universiteRepository.findById(idUniversite).orElse(null);
        Departement departement=departementRepository.findById(idDepartement).orElse(null);
        if (departement!=null && universite!=null)
        {
            //////traitement////////

            universite.getDepartement().add(departement);

///save////////
            universiteRepository.save(universite);
        }
    }
    @Override
    public List<Departement> retrieveDepartementsByUniversite(Long idUniversite) {
        return null;
    }
}
