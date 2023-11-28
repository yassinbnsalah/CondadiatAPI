package com.example.candidatapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Getter
@Setter
@Entity
public class Candidat implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String nom,prenom,email;


    public Candidat() {
        super();
    }

    public Candidat(String nom) {
        super();
        this.nom = nom;
    }

    public Candidat( String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
}
