package com.capraro.contrat.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.capraro.contrat.model.Contrat;
import com.capraro.contrat.repository.ContratRepository;
import com.capraro.contrat.resources.ContratResource;
import com.capraro.contrat.resources.assembler.ContratResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contrats")
public class ContratController {

    @Autowired
    ContratResourceAssembler contratResourceAssembler;

    @Autowired
    ContratRepository contratRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<ContratResource> contrats() {
        List<Contrat> contrats = contratRepository.getAllContrats();

        List<ContratResource> resources = contratResourceAssembler.toResources(contrats);
        return resources;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ContratResource contrat(@PathVariable("id") Long id) {

        Contrat contrat = contratRepository.getContratById(id);

        ContratResource resource = contratResourceAssembler.toResource(contrat);
        return resource;

    }

}
