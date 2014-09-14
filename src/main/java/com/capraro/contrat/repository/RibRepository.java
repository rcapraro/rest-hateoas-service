package com.capraro.contrat.repository;

import com.capraro.contrat.model.Rib;

/**
 * Created by Richard on 13/09/2014.
 */
public interface RibRepository {

    void saveRib(Rib rib);


    Rib getRib(String key);
}
