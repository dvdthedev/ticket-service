package dev.dvd.ticketservice.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

public record EventRequestDTO(
        @NotNull @Future
        LocalDateTime date,
        @NotBlank
        String venue) {}
