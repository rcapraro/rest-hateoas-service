package com.capraro.contrat.model;

public class AssureBuilder {
    private Long id;
    private String nom;

    public AssureBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public AssureBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Assure createAssure() {
        return new Assure(id, nom);
    }
}