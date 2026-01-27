package dev.dvd.ticketservice.service;

import dev.dvd.ticketservice.dto.EventRequestDTO;
import dev.dvd.ticketservice.dto.EventResponseDTO;
import dev.dvd.ticketservice.model.Event;
import dev.dvd.ticketservice.repository.EventRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Transactional
    public EventResponseDTO create(EventRequestDTO registrationData) {

        Event event = convertToEntity(registrationData);
        Event savedEvent = eventRepository.save(event);
        return convertToDTO(savedEvent);

    }

    private EventResponseDTO convertToDTO(Event savedEvent) {
        return new EventResponseDTO(savedEvent);
    }

    private Event convertToEntity(EventRequestDTO registrationData){
        return new Event(registrationData);

    }
}