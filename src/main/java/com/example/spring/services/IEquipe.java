package com.example.spring.services;

import com.example.spring.entites.Equipe;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public interface IEquipe {
    List<Equipe> retrieveAllEquipe();

    Equipe addEquipe(Equipe eq);

    Equipe updateEquipe (Equipe eq);

    Equipe retrieveEquipe (Long idEquipe);

    void removeEquipe(Long idEquipe);
}
