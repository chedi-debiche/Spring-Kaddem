package com.example.spring.services;

import com.example.spring.entites.Contrat;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public interface IContrat {
    List<Contrat> retrieveAllContrat();

    Contrat addContrat(Contrat c);

    Contrat updateContrat (Contrat c);

    Contrat retrieveContrat (Long idContrat);

    void removeContrat(Long idContrat);

    Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE);

}
