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
//@Table( name = « Departement")
public class Departement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart; // Clé primaire
    private String nomDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
    private Set<Etudiant> etudiants;

// Constructeur et accesseurs (getters) et mutateurs (setters)

}
