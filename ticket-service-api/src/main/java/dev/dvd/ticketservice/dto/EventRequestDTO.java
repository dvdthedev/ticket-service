package dev.dvd.ticketservice.dto;

import java.time.LocalDateTime;

public record EventRequestDTO(
        String name,
        LocalDateTime date,
        String venue) {}
