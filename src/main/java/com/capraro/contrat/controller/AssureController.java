package com.capraro.contrat.controller;

import com.capraro.contrat.model.Assure;
import com.capraro.contrat.repository.AssureRepository;
import com.capraro.contrat.resource.AssureResource;
import com.capraro.contrat.resource.assembler.AssureResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assures")
@ExposesResourceFor(AssureResource.class)
public class AssureController {

    @Autowired
    AssureResourceAssembler assureResourceAssembler;

    @Autowired
    AssureRepository assureRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<AssureResource> assures() {
        List<Assure> assures = assureRepository.getAssures();
        List<AssureResource> resources = assureResourceAssembler.toResources(assures);
        return resources;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AssureResource assure(@PathVariable("id") Long id) {
        Assure assure = assureRepository.getAssureById(id);
        AssureResource resource = assureResourceAssembler.toResource(assure);
        return resource;
    }

}
