package com.capraro.contrat.resource.assembler;

import com.capraro.contrat.model.Assure;
import com.capraro.contrat.model.Contrat;
import com.capraro.contrat.model.Souscripteur;
import com.capraro.contrat.resource.AssureResource;
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
public interface AssureResourceMapper {
    AssureResource fromAssure(Assure assure);
}