package com.capraro.contrat.resource.assembler;

import com.capraro.contrat.controller.AssureController;
import com.capraro.contrat.model.Assure;
import com.capraro.contrat.resource.AssureResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 25/05/2014.
 */
@Component
public class AssureResourceAssembler extends ResourceAssemblerSupport<Assure, AssureResource> {

    @Autowired
    AssureResourceMapper assureResourceMapper;

    public AssureResourceAssembler() {
        super(AssureController.class, AssureResource.class);
    }

    @Override
    protected AssureResource instantiateResource(Assure assure) {
        return assureResourceMapper.fromAssure(assure);
    }

    @Override
    public AssureResource toResource(Assure assure) {
        AssureResource resource = createResourceWithId(assure.getId(), assure);
        return resource;
    }
}
