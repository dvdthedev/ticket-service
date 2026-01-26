package dev.dvd.ticketservice.service;

import dev.dvd.ticketservice.repository.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }
}