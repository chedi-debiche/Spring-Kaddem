package com.example.spring.services;
import com.example.spring.entites.Etudiant;
import com.example.spring.entites.Specialite;
import com.example.spring.repository.IContractRepository;
import lombok.AllArgsConstructor;
import com.example.spring.entites.Contrat;
import com.example.spring.repository.IEtudiantRepositroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;
@Slf4j
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

   // @Scheduled(cron = "*/15 * * * * *" )
   // public void cronMethod() {log.info("aymen dahmen");}
   @Override
   public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
       List<Contrat> listContrat=contractRepository.contratBetween2dates(startDate,endDate);
       System.out.println(listContrat);
       float chiffre=0;
       for( Contrat c:listContrat){
           if(c.getSpecialite().equals(Specialite.IA)){
               chiffre=chiffre+300;
           }
           else if (c.getSpecialite().equals(Specialite.RESEAUX)){
               chiffre=chiffre+350;
           }
           else if(c.getSpecialite().equals(Specialite.CLOUD)){
               chiffre=chiffre+400;
           }
           else if (c.getSpecialite().equals(Specialite.SECURITE)){
               chiffre=chiffre+450;
           }
       }
       return chiffre;
   }
    @Override
    public List<Contrat> contratBetween2dates(Date startDate, Date endDate) {
        return  contractRepository.contratBetween2dates(startDate,endDate);
    }
    @Override
    public Integer nbContratsValides(Date endDate, Date startDate) {
        return contractRepository.countContratByDateDebutContratAfterAndDateFinContratBefore(endDate,startDate);
    }





}
