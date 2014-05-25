package com.capraro.contrat.repository.impl;

import com.capraro.contrat.model.*;
import com.capraro.contrat.repository.ContratRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Richard on 25/05/2014.
 */
@Repository
public class ContratRepositoryImpl implements ContratRepository {

    @Override
    public Contrat getContratById(Long id) {

        return generateContrat1();
    }

    @Override
    public List<Contrat> getAllContrats() {
        return Arrays.asList(generateContrat1(), generateContrat2());
    }


    private Contrat generateContrat1() {

        Assure assure = new AssureBuilder()
                .setId(123L)
                .setNom("Kevin Martin")
                .createAssure();

        Souscripteur souscripteur = new SouscripteurBuilder()
                .setId(456L)
                .setNom("Pierre Martin")
                .createSouscripteur();

        Contrat contrat = new ContratBuilder()
                .setId(1)
                .setNumero("1S0032")
                .setAssure(assure)
                .setDateCreation(new Date())
                .setDateEffet(new Date())
                .setSouscripteur(souscripteur)
                .createContrat();

        return contrat;
    }


    private Contrat generateContrat2() {
        Assure assure = new AssureBuilder()
                .setId(246L)
                .setNom("Josette Dupont")
                .createAssure();

        Souscripteur souscripteur = new SouscripteurBuilder()
                .setId(357L)
                .setNom("Jacques Dupont")
                .createSouscripteur();

        Contrat contrat = new ContratBuilder()
                .setId(2)
                .setNumero("1H0019")
                .setDateCreation(new Date())
                .setDateEffet(new Date())
                .setAssure(assure)
                .setSouscripteur(souscripteur)
                .createContrat();

        return contrat;
    }

}
