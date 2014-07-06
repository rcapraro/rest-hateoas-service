package com.capraro.contrat.command;

import com.capraro.contrat.command.base.Command;

/**
 * Created by Richard on 06/07/2014.
 */
public class RibCreatedCommand implements Command {

    private Long idAssure;
    private String libelle;
    private String iban;

    public RibCreatedCommand() {
    }

    public RibCreatedCommand(Long idAssure, String libelle, String iban) {
        this.idAssure = idAssure;
        this.libelle = libelle;
        this.iban = iban;
    }

    @Override
    public boolean isValid() {
        return true; //always valid
    }

    public Long getIdAssure() {
        return idAssure;
    }

    public void setIdAssure(Long idAssure) {
        this.idAssure = idAssure;
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
}
