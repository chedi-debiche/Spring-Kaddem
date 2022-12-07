package com.example.spring.controller;

import com.example.spring.entites.Departement;
import com.example.spring.entites.Etudiant;
import com.example.spring.services.IDepartement;
import com.example.spring.services.IEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/Departement")
@RestController
@RequiredArgsConstructor
@Component
@CrossOrigin(origins = "http://localhost:4200")

public class DepartementController {
    private final IDepartement departement;

    @GetMapping("/AfficherAllDepartement")
    List<Departement> retrieveAllDepartement() {

        return  departement.retrieveAllDepartement();
    }


    @PostMapping("/AjouterDepartement")
    Departement addDepartement(@RequestBody Departement d){
        return  departement.addDepartement(d);

    }



    @PutMapping("/ModifierDepartement")
    Departement updateDepartement (@RequestBody Departement d){

        return departement.updateDepartement(d);
    }

    @GetMapping("/AfficherDepartement/{idE}")
    Departement retrieveDepartement (@PathVariable("idE") Long id){
        return departement.retrieveDepartement(id);
    }


    @DeleteMapping("/supprimerDepartement/{id}")
    void removeDepartement (@PathVariable Long id){
        departement.removeDepartement(id);

    }

    @GetMapping("/departement/universite/{idUniv}")
    List<Departement> getDepartementsByUniversite(@PathVariable Long idUniv){
        return departement.retrieveDepartementsByUniversite(idUniv);
    }
}
