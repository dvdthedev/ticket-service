package dev.dvd.ticketservice.dto;

import java.time.LocalDateTime;

public record EventResponseDTO(Long id,
                               String name,
                               LocalDateTime date,
                               String venue) {}
