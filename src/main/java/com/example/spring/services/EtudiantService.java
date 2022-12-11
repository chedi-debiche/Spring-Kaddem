package com.example.spring.services;
import com.example.spring.entites.Contrat;
import com.example.spring.entites.Equipe;
import com.example.spring.repository.*;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Etudiant;
import com.example.spring.entites.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiant {
    @Autowired
    private  IEtudiantRepositroy etudiantRepository;
    @Autowired
    private  IDepartementRepository departementRepository;
    @Autowired
    private IContractRepository contractRepository;
    @Autowired
    private IEquipeRepository equipeRepository;


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


    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void assignEtudiantToDepartement(Long etudiantId, Long departementId) {
        Etudiant etudiant= etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement= departementRepository.findById(departementId).orElse(null);
        if (etudiant!=null && departement!=null)
        {
            //////traitement////////
            etudiant.setDepartement(departement);
///save////////
            etudiantRepository.save(etudiant);
        }

    }
    @Transactional
    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Long idEquipe) {
        Contrat contrat = contractRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Set<Contrat> sd = new HashSet<>();
        Set<Equipe> se = new HashSet<>();
        sd.add(contrat);
        e.setContrat(sd);
        se.add(equipe);
        e.setEquipe(se);
        contrat.setEtudiant(e);
        //this.update(contrat);
        //  etudiantServiceImp.add(e);
        etudiantRepository.save(e);
        return e;
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Long idDepartement) {
        Departement dep = departementRepository.findById(idDepartement).orElse(null);
        return  new ArrayList<Etudiant>(dep.getEtudiants());
    }
}
