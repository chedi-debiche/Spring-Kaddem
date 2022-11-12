package com.example.spring.services;

import lombok.AllArgsConstructor;
import com.example.spring.entites.Equipe;
import com.example.spring.repository.IEquipeRepository;
import com.example.spring.repository.IEtudiantRepositroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipe{
    private final IEquipeRepository equipeRepository;
    @Override
      public List<Equipe> retrieveAllEquipe() {
       return (List<Equipe>) equipeRepository.findAll();
   }
    @Override
    public Equipe addEquipe(Equipe eq) {
        return  equipeRepository.save(eq);
    }
    @Override
    public Equipe updateEquipe(Equipe eq) {
        return equipeRepository.save(eq);
    }
    @Override
    public Equipe retrieveEquipe(Long idEquipe) {
        return equipeRepository.findById(Long.valueOf(idEquipe)).get();

    }

    @Override
    public void removeEquipe(Long idEquipe) {
        equipeRepository.deleteById(idEquipe);
    }
}
