package com.capraro.contrat.controller;

import com.capraro.contrat.command.RibCreatedCommand;
import com.capraro.contrat.command.base.CommandHandler;
import com.capraro.contrat.model.Rib;
import com.capraro.contrat.repository.RibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ribs")
public class RibController {

    @Autowired
    RibRepository ribRepository;

    @Autowired
    CommandHandler ribCreatedCommandHandler;


    /**
     * sample:
     * {
     * "idAssure" : 1,
     * "libelle"  : "test rib",
     * "iban"     : 12456
     * }
     *
     * @param ribCreatedCommand
     */
    @RequestMapping(method = RequestMethod.POST)
    public void saveRib(@RequestBody RibCreatedCommand ribCreatedCommand) {

        ribCreatedCommandHandler.handleCommand(ribCreatedCommand);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Rib get(@PathVariable String id) {

        return ribRepository.getRib(id);

    }


}
