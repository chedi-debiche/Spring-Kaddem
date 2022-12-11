package com.example.spring.controller;
import com.example.spring.entites.Projet;
import com.example.spring.services.IProjet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/Projet")
@RestController
@RequiredArgsConstructor
@Component
@CrossOrigin(origins = "http://localhost:4200")

public class ProjetController {
    private final IProjet projet;

    @GetMapping("/AfficherAllProjet")
    List<Projet> retrieveAllProjet() {

        return  projet.retrieveAllProjet();
    }


    @PostMapping("/AjouterProjet")
    Projet addProjet(@RequestBody Projet p){
        return  projet.addProjet(p);

    }



    @PutMapping("/modifierProjet")
    Projet updateProjet (@RequestBody Projet p){

        return projet.updateProjet(p);
    }


    @DeleteMapping("/supprimerProjet/{id}")
    void removeProjet (@PathVariable Long id){
        projet.removeProjet(id);

    }
}
