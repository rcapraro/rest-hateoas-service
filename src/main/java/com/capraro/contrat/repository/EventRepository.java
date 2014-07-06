package com.capraro.contrat.repository;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Richard on 06/07/2014.
 */
public interface EventRepository {

    void saveEvent(ApplicationEvent event);
}
