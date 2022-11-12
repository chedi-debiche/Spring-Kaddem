package com.example.spring.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.example.spring.entites.Etudiant;
import com.example.spring.services.IEtudiant;
import java.util.List;
@RequestMapping("/Etudiant")
@RestController
@RequiredArgsConstructor
@Component
//@AllArgsConstructor
public class EtudiantController {
   private final IEtudiant etudiant;

   @GetMapping("/AfficherAllEtudiant")
    List<Etudiant> retrieveAllEtudiant() {

        return  etudiant.retrieveAllEtudiant();
    }


    @PostMapping("/AjouterEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return  etudiant.addEtudiant(e);

    }



    @PutMapping("/ModifierEtudiant")
    Etudiant updateEtudiant (@RequestBody Etudiant e){

        return etudiant.updateEtudiant(e);
    }

    @GetMapping("/AfficherEtudiant/{idE}")
    Etudiant retrieveEtudiant (@PathVariable("idE") Long id){
        return etudiant.retrieveEtudiant(id);
    }


    @DeleteMapping("/supprimerEtudiant/{id}")
    void removeEtudiant (@PathVariable Long id){
        etudiant.removeEtudiant(id);

    }
}
