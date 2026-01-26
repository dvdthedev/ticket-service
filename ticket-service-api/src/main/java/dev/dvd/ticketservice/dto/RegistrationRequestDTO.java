package dev.dvd.ticketservice.dto;

public record RegistrationRequestDTO(
        Long eventId,
        String attendeeName,
        String attendeeEmail) {}