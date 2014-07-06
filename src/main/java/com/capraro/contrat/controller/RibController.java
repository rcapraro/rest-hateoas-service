package com.capraro.contrat.controller;

import com.capraro.contrat.command.RibCreatedCommand;
import com.capraro.contrat.command.RibCreatedCommandHandler;
import com.capraro.contrat.command.base.CommandHandler;
import com.capraro.contrat.repository.AssureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ribs")
public class RibController {

    @Autowired
    AssureRepository assureRepository;

    @Autowired
    CommandHandler ribCreatedCommandHandler;


    /**
     * sample:
     * {
     *   "idAssure" : 1,
     *   "libelle"  : "test rib",
     *   "iban"     : 12456
     * }
     * @param ribCreatedCommand
     */
    @RequestMapping(method = RequestMethod.POST)
    public void saveRib(@RequestBody RibCreatedCommand ribCreatedCommand) {

        ribCreatedCommandHandler.handleCommand(ribCreatedCommand);

    }


}
