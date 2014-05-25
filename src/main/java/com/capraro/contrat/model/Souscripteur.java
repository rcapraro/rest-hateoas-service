package com.capraro.contrat.model;

/**
 * Created by Richard on 23/05/2014.
 */
public class Souscripteur {

    private Long id;
    private String nom;

    public Souscripteur(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
