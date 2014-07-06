package com.capraro.contrat.command.base;

import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by Richard on 06/07/2014.
 */
@CommandHandlerAnnotation
public interface CommandHandler<C extends Command> extends ApplicationEventPublisherAware {

    void handleCommand(C command);

}
