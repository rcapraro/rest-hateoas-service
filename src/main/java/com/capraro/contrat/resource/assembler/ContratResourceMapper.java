package com.capraro.contrat.resource.assembler;

import com.capraro.contrat.model.Assure;
import com.capraro.contrat.model.Contrat;
import com.capraro.contrat.model.Souscripteur;
import com.capraro.contrat.resource.ContratResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 25/05/2014.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Component
public interface ContratResourceMapper {

    @Mappings({
            @Mapping(source = "souscripteur.nom", target = "nomSouscripteur"),
            @Mapping(source = "assure.nom", target = "nomAssure")
    })
    ContratResource fromContrat(Contrat contrat, Assure assure, Souscripteur souscripteur);
}