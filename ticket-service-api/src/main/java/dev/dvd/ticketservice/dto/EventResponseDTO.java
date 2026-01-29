package dev.dvd.ticketservice.dto;

import dev.dvd.ticketservice.model.Event;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record EventResponseDTO(Long id,
                               @NotNull @Future
                               LocalDateTime date,
                               @NotBlank @Min(20)
                               String venue) {
    public EventResponseDTO(Event event) {
        this(event.getId(), event.getDate(), event.getVenue());
    }
}
