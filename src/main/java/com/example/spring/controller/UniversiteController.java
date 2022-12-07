package com.example.spring.controller;
import com.example.spring.entites.Etudiant;
import com.example.spring.services.IEtudiant;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.example.spring.entites.Universite;
import com.example.spring.services.IUniversite;
import java.util.List;
@RequestMapping("/Universite")
@RequiredArgsConstructor
@Component
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UniversiteController {
    private final IUniversite universite;

    @GetMapping("/AfficherAllUniversite")
    List<Universite> retrieveAllUniversite() {

        return  universite.retrieveAllUniversite();
    }


    @PostMapping("/AjouterUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return  universite.addUniversite(u);

    }



    @PutMapping("/ModifierUniversite")
    Universite updateUniversite (@RequestBody Universite u){

        return universite.updateUniversite(u);
    }

    @GetMapping("/AfficherUniversite/{idE}")
    Universite retrieveUniversite (@PathVariable("idE") Long id){
        return universite.retrieveUniversite(id);
    }


    @DeleteMapping("/supprimerUniversite/{id}")
    void removeUniversite (@PathVariable Long id){
        universite.removeUniversite(id);

    }
    @PostMapping("/assignUniversiteToDepartement/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Long idUniversite,@PathVariable Long idDepartement) {
        universite.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
}
