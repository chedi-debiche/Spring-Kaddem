package com.example.spring.services;
import com.example.spring.repository.IEtudiantRepositroy;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Universite;
import com.example.spring.repository.IUniversiteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversite{
    private final IUniversiteRepository universiteRepository;
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
}
