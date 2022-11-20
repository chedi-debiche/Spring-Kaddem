package com.example.spring.services;
import com.example.spring.entites.Etudiant;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IEtudiant {

    List<Etudiant> retrieveAllEtudiant();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant (Long idEtudiant);

    void removeEtudiant(Long idEtudiant);

    public void assignEtudiantToDepartement (Long etudiantId, Long departementId) ;
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Long idEquipe);

}
