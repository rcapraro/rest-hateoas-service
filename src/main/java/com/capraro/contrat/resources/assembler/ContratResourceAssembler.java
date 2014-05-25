package com.capraro.contrat.resources.assembler;

import com.capraro.contrat.controller.ContratController;
import com.capraro.contrat.model.Contrat;
import com.capraro.contrat.resources.ContratResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 24/05/2014.
 */
@Component
public class ContratResourceAssembler extends ResourceAssemblerSupport<Contrat, ContratResource> {

    @Autowired
    ContratResourceMapper contratResourceMapper;

    public ContratResourceAssembler() {
        super(ContratController.class, ContratResource.class);
    }

    @Override
    protected ContratResource instantiateResource(Contrat contrat) {
        return contratResourceMapper.fromContrat(contrat, contrat.getAssure(), contrat.getSouscripteur());
    }

    @Override
    public ContratResource toResource(Contrat contrat) {
        ContratResource resource = createResourceWithId(contrat.getId(), contrat);
        return resource;
    }

}
