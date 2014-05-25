package com.capraro.contrat.model;

public class SouscripteurBuilder {
    private Long id;
    private String nom;

    public SouscripteurBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public SouscripteurBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Souscripteur createSouscripteur() {
        return new Souscripteur(id, nom);
    }
}