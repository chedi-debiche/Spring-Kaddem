package com.example.spring.services;
import com.example.spring.entites.Etudiant;
import com.example.spring.repository.IContractRepository;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Contrat;
import com.example.spring.repository.IEtudiantRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ContractService implements IContrat {
    @Autowired
  private   IContractRepository contractRepository;
    @Autowired
    private   IEtudiantRepositroy etudiantRepositroy;

    @Override
     public List<Contrat> retrieveAllContrat() {
         return (List<Contrat>) contractRepository.findAll();
     }
    @Override
    public Contrat addContrat(Contrat c) {
        return  contractRepository.save(c);
    }
    @Override
    public Contrat updateContrat(Contrat c) {
        return contractRepository.save(c);
    }
    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return contractRepository.findById(Long.valueOf(idContrat)).get();

    }

    @Override
    public void removeContrat(Long idContrat) {
        contractRepository.deleteById(idContrat);
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        Etudiant etudiant = etudiantRepositroy.findEtudiantByprenomE(prenomE);
        Set<Contrat> contratsEtudiant = etudiant.getContrat();
        if(contratsEtudiant.size() < 5) ce.setEtudiant(etudiant);
        return contractRepository.save(ce);

    }

}
