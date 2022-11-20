package com.example.spring.repository;

import com.example.spring.entites.Contrat;
import com.example.spring.entites.Etudiant;
import com.example.spring.services.ContractService;
import org.springframework.data.repository.CrudRepository;

public interface IContractRepository extends CrudRepository<Contrat, Long> {


}
