package com.example.spring.controller;

import com.example.spring.entites.DetailEquipe;
import com.example.spring.entites.Etudiant;
import com.example.spring.services.IDetailEquipe;
import com.example.spring.services.IEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/DetailEquipe")
@RestController
@RequiredArgsConstructor
@Component
@CrossOrigin(origins = "http://localhost:4200")

public class DetailEquipeController {
    private final IDetailEquipe detailEquipe;

    @GetMapping("/AfficherAllDetailEquipe")
    List<DetailEquipe> retrieveAllDetailEquipe() {

        return  detailEquipe.retrieveAllDetailEquipe();
    }


    @PostMapping("/AjouterDetailEquipe")
    DetailEquipe addDetailEquipe(@RequestBody DetailEquipe de){
        return  detailEquipe.addDetailEquipe(de);

    }



    @PutMapping("/ModifierDetailEquipe")
    DetailEquipe updateDetailEquipe (@RequestBody DetailEquipe de){

        return detailEquipe.updateDetailEquipe(de);
    }

    @GetMapping("/AfficherDetailEquipe/{idE}")
    DetailEquipe retrieveDetailEquipe (@PathVariable("idE") Long id){
        return detailEquipe.retrieveDetailEquipe(id);
    }


    @DeleteMapping("/supprimerDetailEquipe/{id}")
    void removeDetailEquipe (@PathVariable Long id){
        detailEquipe.removeDetailEquipe(id);

    }
}
