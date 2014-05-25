package com.capraro.contrat.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Richard on 23/05/2014.
 */
public class Contrat {

    private long id;
    private String numero;
    private Date dateCreation;
    private Date dateEffet;
    private Assure assure;
    private Souscripteur souscripteur;
    private List<Quittance> quittances;
    private ModeReglement modeReglement;
    private Rib rib;

    public Contrat(long id, String numero, Date dateCreation, Date dateEffet, Assure assure, Souscripteur souscripteur, List<Quittance> quittances, ModeReglement modeReglement, Rib rib) {
        this.id = id;
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.dateEffet = dateEffet;
        this.assure = assure;
        this.souscripteur = souscripteur;
        this.quittances = quittances;
        this.modeReglement = modeReglement;
        this.rib = rib;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
    }

    public Assure getAssure() {
        return assure;
    }

    public void setAssure(Assure assure) {
        this.assure = assure;
    }

    public Souscripteur getSouscripteur() {
        return souscripteur;
    }

    public void setSouscripteur(Souscripteur souscripteur) {
        this.souscripteur = souscripteur;
    }

    public List<Quittance> getQuittances() {
        return quittances;
    }

    public void setQuittances(List<Quittance> quittances) {
        this.quittances = quittances;
    }

    public ModeReglement getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(ModeReglement modeReglement) {
        this.modeReglement = modeReglement;
    }

    public Rib getRib() {
        return rib;
    }

    public void setRib(Rib rib) {
        this.rib = rib;
    }
}
