package com.capraro.contrat.model;

import java.util.Date;

/**
 * Created by Richard on 23/05/2014.
 */
public class Assure {

    private Long id;
    private String nom;
    private Date dateNaissance;

    public Assure(Long id, String nom, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
