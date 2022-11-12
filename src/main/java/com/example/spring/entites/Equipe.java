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

@Entity
@Getter
@Setter
@Component
//@Table( name = « Equipe")
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Long idEquipe; // Clé primaire
    private String nomEquipe;
    @Enumerated(EnumType.STRING)//string
    private Niveau niveau;
    @OneToOne
    private DetailEquipe detailEquipe;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
// Constructeur et accesseurs (getters) et mutateurs (setters)


}

