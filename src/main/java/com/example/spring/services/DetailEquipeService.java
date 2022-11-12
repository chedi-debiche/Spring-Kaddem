package com.example.spring.services;
import com.example.spring.entites.Etudiant;
import lombok.AllArgsConstructor;
import com.example.spring.entites.DetailEquipe;
import com.example.spring.repository.IDetailequipeRepository;
import com.example.spring.repository.IEtudiantRepositroy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailEquipeService implements IDetailEquipe{
  private final IDetailequipeRepository detailequipeRepository;
    public List<DetailEquipe> retrieveAllDetailEquipe() {
        return (List<DetailEquipe>) detailequipeRepository.findAll();
    }
    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe de) {
        return  detailequipeRepository.save(de);
    }
    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe de) {
        return detailequipeRepository.save(de);
    }
    @Override
    public DetailEquipe retrieveDetailEquipe(Long idDetailEquipe) {
        return detailequipeRepository.findById(Long.valueOf(idDetailEquipe)).get();

    }

    @Override
    public void removeDetailEquipe(Long idDetailEquipe) {
        detailequipeRepository.deleteById(idDetailEquipe);
    }
}
