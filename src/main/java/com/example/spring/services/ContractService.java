package com.example.spring.services;
import com.example.spring.entites.Etudiant;
import com.example.spring.repository.IContractRepository;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Contrat;
import com.example.spring.repository.IEtudiantRepositroy;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ContractService implements IContrat {
  private final   IContractRepository contractRepository;
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

}
