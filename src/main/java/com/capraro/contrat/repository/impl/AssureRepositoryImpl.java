package com.capraro.contrat.repository.impl;

import com.capraro.contrat.model.Assure;
import com.capraro.contrat.model.AssureBuilder;
import com.capraro.contrat.repository.AssureRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Richard on 25/05/2014.
 */
@Repository
public class AssureRepositoryImpl implements AssureRepository {

    @Override
    public Assure getAssureById(Long id) {
        Assure assure = new AssureBuilder()
                .setId(123L)
                .setNom("Kevin Martin")
                .createAssure();
        return assure;
    }

    @Override
    public List<Assure> getAssures() {

        Assure assure1 = new AssureBuilder()
                .setId(123L)
                .setNom("Kevin Martin")
                .createAssure();

        Assure assure2 = new AssureBuilder()
                .setId(246L)
                .setNom("Josette Dupont")
                .createAssure();

        return Arrays.asList(assure1, assure2);
    }
}
