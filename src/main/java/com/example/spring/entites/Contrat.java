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
import java.util.Date;

@Entity
@Getter
@Setter
@Component
//@Table( name = « Contrat")
public class Contrat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat; // Clé primaire
    @Temporal (TemporalType.DATE)
    private Date DateDebutContrat;
    @Temporal (TemporalType.DATE)
    private Date DateFinContrat;
    private Boolean archive;
    private Integer montantContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
    Etudiant etudiant;
// Constructeur et accesseurs (getters) et mutateurs (setters)


}
