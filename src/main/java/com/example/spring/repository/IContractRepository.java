package com.example.spring.repository;

import com.example.spring.entites.Contrat;
import com.example.spring.entites.Etudiant;
import com.example.spring.services.ContractService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface IContractRepository extends CrudRepository<Contrat, Long> {

    @Query("select  count (c) from Contrat c where c.DateFinContrat<=?1 and c.DateDebutContrat>=?2")
    Integer countContratByDateDebutContratAfterAndDateFinContratBefore(Date DateFinContrat, Date DateDebutContrat);
    @Query("select  SUM(c.montantContrat) from Contrat c where c.DateFinContrat<=?2 and c.DateDebutContrat>=?1")
    float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);

    @Query("select c from Contrat c where   c.DateDebutContrat>=?1 and c.DateFinContrat<=?2")
    List<Contrat> contratBetween2dates(Date startDate, Date endDate);

}
