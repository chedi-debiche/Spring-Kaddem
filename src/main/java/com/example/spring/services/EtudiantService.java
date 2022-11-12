package com.example.spring.services;
import com.example.spring.repository.IEtudiantRepositroy;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiant {
   private final IEtudiantRepositroy etudiantRepository;
   @Override
   public List<Etudiant> retrieveAllEtudiant() {
       return (List<Etudiant>) etudiantRepository.findAll();
   }
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return  etudiantRepository.save(e);
    }
    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }
    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(Long.valueOf(idEtudiant)).get();

    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }


}
