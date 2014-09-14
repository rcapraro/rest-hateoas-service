package com.capraro.contrat.command;

import com.capraro.contrat.command.base.CommandHandler;
import com.capraro.contrat.command.base.CommandHandlerAnnotation;
import com.capraro.contrat.event.RibCreatedEvent;
import com.capraro.contrat.model.Rib;
import com.capraro.contrat.repository.RibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Richard on 06/07/2014.
 */
@CommandHandlerAnnotation
public class RibCreatedCommandHandler implements CommandHandler<RibCreatedCommand> {

    private ApplicationEventPublisher applicationEventPublisher = null;

    @Autowired
    private RibRepository ribRepository;

    @Override
    public void handleCommand(RibCreatedCommand command) {

        //1 validate command
        if (!command.isValid()) {
            throw new IllegalArgumentException("Command invalid !");
        }

        //2 save command to model
        //let say an id is generated
        Long id = 123L;
        Rib rib = new Rib.Builder()
                .id(id)
                .actif(true)
                .dateCreation(LocalDate.now())
                .iban("FR7612343M04606")
                .build();

        ribRepository.saveRib(rib);

        //3 dispatch Domain event to database domain(read model)
        this.applicationEventPublisher.publishEvent(new RibCreatedEvent(this,
                id,
                command.getLibelle(),
                command.getIban(),
                new Date()));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

}
