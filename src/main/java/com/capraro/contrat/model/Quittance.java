package com.capraro.contrat.model;

import java.math.BigDecimal;

/**
 * Created by Richard on 23/05/2014.
 */
public class Quittance {

    private Long id;
    private String libelle;
    private BigDecimal montant;

    public Quittance(Long id, String libelle, BigDecimal montant) {
        this.id = id;
        this.libelle = libelle;
        this.montant = montant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}
