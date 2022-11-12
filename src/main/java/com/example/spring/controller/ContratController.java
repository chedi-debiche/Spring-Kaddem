package com.example.spring.controller;

import com.example.spring.entites.Contrat;
import com.example.spring.services.IContrat;
import com.example.spring.services.IEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/Contrat")
@RestController
@RequiredArgsConstructor
@Component
public class ContratController {
    private final IContrat contrat;

    @GetMapping("/AfficherAllContrat")
    List<Contrat> retrieveAllContrat() {

        return  contrat.retrieveAllContrat();
    }


    @PostMapping("/AjouterContrat")
    Contrat addContrat(@RequestBody Contrat c){
        return  contrat.addContrat(c);

    }



    @PutMapping("/ModifierContrat")
    Contrat updateContrat (@RequestBody Contrat c){

        return contrat.updateContrat(c);
    }

    @GetMapping("/AfficherContrat/{idE}")
    Contrat retrieveContrat (@PathVariable("idE") Long id){
        return contrat.retrieveContrat(id);
    }


    @DeleteMapping("/supprimerContrat/{id}")
    void removeContrat (@PathVariable Long id){
        contrat.removeContrat(id);

    }
}
