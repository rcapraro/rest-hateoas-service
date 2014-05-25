package com.capraro.contrat.model;

import java.util.Date;

public class AssureBuilder {
    private Long id;
    private String nom;
    private Date dateNaissance;

    public AssureBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public AssureBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public AssureBuilder setDateNaissance(Date date) {
        this.dateNaissance = dateNaissance;
        return this;
    }

    public Assure createAssure() {
        return new Assure(id, nom, dateNaissance);
    }
}