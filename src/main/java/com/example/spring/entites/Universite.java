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
//@Table( name = « Universite")
public class Universite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Long idUniv; // Clé primaire
    private String nomUniv;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departement;
// Constructeur et accesseurs (getters) et mutateurs (setters)

}
