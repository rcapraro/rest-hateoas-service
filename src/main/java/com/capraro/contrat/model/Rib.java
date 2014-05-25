package com.capraro.contrat.model;

import java.util.Date;

/**
 * Created by Richard on 23/05/2014.
 */
public class Rib {

    private long id;
    private Date dateCreation;
    private boolean actif;
    private String iban;

    public Rib(long id, Date dateCreation, boolean actif, String iban) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.actif = actif;
        this.iban = iban;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
