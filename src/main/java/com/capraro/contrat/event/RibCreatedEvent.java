package com.capraro.contrat.event;

import org.springframework.context.ApplicationEvent;

import java.util.Date;

/**
 * Created by Richard on 06/07/2014.
 */
public class RibCreatedEvent extends ApplicationEvent {

    private Long id;
    private String libelle;
    private String iban;
    private Date dateCreation;


    public RibCreatedEvent(Object source) {
        super(source);
    }

    public RibCreatedEvent(Object source, Long id, String libelle, String iban, Date dateCreation) {
        super(source);
        this.id = id;
        this.libelle = libelle;
        this.iban = iban;
        this.dateCreation = dateCreation;
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

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "RibCreatedEvent{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", iban='" + iban + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
