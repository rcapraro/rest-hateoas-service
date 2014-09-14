package com.capraro.contrat.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

/**
 * Created by Richard on 23/05/2014.
 */
public class Rib {

    private long id;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateCreation;
    private boolean actif;
    private String iban;

    public Rib() {
    }

    public Rib(long id, LocalDate dateCreation, boolean actif, String iban) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.actif = actif;
        this.iban = iban;
    }

    private Rib(Builder builder) {
        setId(builder.id);
        setDateCreation(builder.dateCreation);
        setActif(builder.actif);
        setIban(builder.iban);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
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

    public static final class Builder {
        private long id;
        private LocalDate dateCreation;
        private boolean actif;
        private String iban;

        public Builder() {
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder dateCreation(LocalDate dateCreation) {
            this.dateCreation = dateCreation;
            return this;
        }

        public Builder actif(boolean actif) {
            this.actif = actif;
            return this;
        }

        public Builder iban(String iban) {
            this.iban = iban;
            return this;
        }

        public Rib build() {
            return new Rib(this);
        }
    }
}
