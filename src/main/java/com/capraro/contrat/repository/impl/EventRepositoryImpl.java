package com.capraro.contrat.repository.impl;

import com.capraro.contrat.repository.EventRepository;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Repository;

/**
 * Created by Richard on 06/07/2014.
 */
@Repository
public class EventRepositoryImpl implements EventRepository, ApplicationListener<ApplicationEvent> {


    @Override
    public void saveEvent(ApplicationEvent event) {
        System.out.println("Event " + event + "saved !");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        saveEvent(applicationEvent);
    }
}