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

@Entity
@Getter
@Setter
@Component
//@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Long idDetailEquipe; // Clé primaire
    private Integer salle;
    private String thematique;
    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
// Constructeur et accesseurs (getters) et mutateurs (setters)


}
