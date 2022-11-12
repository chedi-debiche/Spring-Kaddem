package com.example.spring.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;
import java.util.List;

@Entity
@Getter
@Setter
@Component
//@Table( name = « Etudiant")
public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrat;
    @ManyToOne
    private Departement departement;
    /*@ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipe;*/
    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipe;
// Constructeur et accesseurs (getters) et mutateurs (setters)


}
