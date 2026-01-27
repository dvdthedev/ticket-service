package dev.dvd.ticketservice.dto;

import dev.dvd.ticketservice.model.Event;

import java.time.LocalDateTime;

public record EventResponseDTO(Long id,
                               LocalDateTime date,
                               String venue) {
    public EventResponseDTO(Event event) {
        this(event.getId(), event.getDate(), event.getVenue());
    }
}
