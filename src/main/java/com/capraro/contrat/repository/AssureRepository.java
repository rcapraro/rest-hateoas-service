package com.capraro.contrat.repository;

import com.capraro.contrat.model.Assure;
import com.capraro.contrat.model.Contrat;

import java.util.List;

/**
 * Created by Richard on 25/05/2014.
 */
public interface AssureRepository {
    Assure getAssureById(Long id);

    List<Assure> getAssures();

}
