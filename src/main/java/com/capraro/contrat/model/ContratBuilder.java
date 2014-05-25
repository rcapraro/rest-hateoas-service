package com.capraro.contrat.model;

import java.util.Date;
import java.util.List;

public class ContratBuilder {
    private long id;
    private String numero;
    private Date dateCreation;
    private Date dateEffet;
    private Assure assure;
    private Souscripteur souscripteur;
    private List<Quittance> quittances;
    private ModeReglement modeReglement;
    private Rib rib;

    public ContratBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public ContratBuilder setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public ContratBuilder setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
        return this;
    }

    public ContratBuilder setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
        return this;
    }

    public ContratBuilder setAssure(Assure assure) {
        this.assure = assure;
        return this;
    }

    public ContratBuilder setSouscripteur(Souscripteur souscripteur) {
        this.souscripteur = souscripteur;
        return this;
    }

    public ContratBuilder setQuittances(List<Quittance> quittances) {
        this.quittances = quittances;
        return this;
    }

    public ContratBuilder setModeReglement(ModeReglement modeReglement) {
        this.modeReglement = modeReglement;
        return this;
    }

    public ContratBuilder setRib(Rib rib) {
        this.rib = rib;
        return this;
    }

    public Contrat createContrat() {
        return new Contrat(id, numero, dateCreation, dateEffet, assure, souscripteur, quittances, modeReglement, rib);
    }
}