package com.example.spring.services;

import com.example.spring.entites.DetailEquipe;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface IDetailEquipe {
    List<DetailEquipe> retrieveAllDetailEquipe();

    DetailEquipe addDetailEquipe(DetailEquipe de);

    DetailEquipe updateDetailEquipe (DetailEquipe de);

    DetailEquipe retrieveDetailEquipe (Long idDetailEquipe);

    void removeDetailEquipe(Long idDetailEquipe);
}
