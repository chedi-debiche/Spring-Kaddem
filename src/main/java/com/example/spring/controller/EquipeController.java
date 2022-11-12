package com.example.spring.controller;

import com.example.spring.entites.Equipe;
import com.example.spring.services.IEquipe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/Equipe")
@RestController
@RequiredArgsConstructor
@Component
public class EquipeController {
    private final IEquipe equipe;

    @GetMapping("/AfficherAllEquipe")
    List<Equipe> retrieveAllEquipe() {

        return  equipe.retrieveAllEquipe();
    }


    @PostMapping("/AjouterEquipe")
    Equipe addEquipe(@RequestBody Equipe eq){
        return  equipe.addEquipe(eq);

    }



    @PutMapping("/modifierEquipe")
    Equipe updateEquipe (@RequestBody Equipe eq){

        return equipe.updateEquipe(eq);
    }

    @GetMapping("/AfficherEquipe/{idE}")
    Equipe retrieveEtudiant (@PathVariable("idE") Long id){
        return equipe.retrieveEquipe(id);
    }


    @DeleteMapping("/supprimerEquipe/{id}")
    void removeEquipe (@PathVariable Long id){
        equipe.removeEquipe(id);

    }
}
