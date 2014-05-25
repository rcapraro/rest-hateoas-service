package com.capraro.contrat.resource;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Richard on 24/05/2014.
 */
public class ContratResource extends ResourceSupport {

    private String numero;
    private String dateCreation;
    private String dateEffet;
    private String nomAssure;
    private String nomSouscripteur;
    private String montantDerniereQuittance;
    private String iban;

    public ContratResource() {
    }

    public ContratResource(String numero, String dateCreation, String dateEffet, String nomAssure, String nomSouscripteur, String montantDerniereQuittance, String iban) {
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.dateEffet = dateEffet;
        this.nomAssure = nomAssure;
        this.nomSouscripteur = nomSouscripteur;
        this.montantDerniereQuittance = montantDerniereQuittance;
        this.iban = iban;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(String dateEffet) {
        this.dateEffet = dateEffet;
    }

    public String getNomAssure() {
        return nomAssure;
    }

    public void setNomAssure(String nomAssure) {
        this.nomAssure = nomAssure;
    }

    public String getNomSouscripteur() {
        return nomSouscripteur;
    }

    public void setNomSouscripteur(String nomSouscripteur) {
        this.nomSouscripteur = nomSouscripteur;
    }

    public String getMontantDerniereQuittance() {
        return montantDerniereQuittance;
    }

    public void setMontantDerniereQuittance(String montantDerniereQuittance) {
        this.montantDerniereQuittance = montantDerniereQuittance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public Link getId() {
        return super.getId();
    }
}
