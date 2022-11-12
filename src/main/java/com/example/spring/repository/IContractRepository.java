package com.example.spring.repository;

import com.example.spring.entites.Contrat;
import org.springframework.data.repository.CrudRepository;

public interface IContractRepository extends CrudRepository<Contrat, Long> {
}
