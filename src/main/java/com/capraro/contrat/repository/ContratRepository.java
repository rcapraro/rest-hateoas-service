package com.capraro.contrat.repository;

import com.capraro.contrat.model.Contrat;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Richard on 25/05/2014.
 */
public interface ContratRepository {

    Contrat getContratById(Long id);

    List<Contrat> getAllContrats();

}
