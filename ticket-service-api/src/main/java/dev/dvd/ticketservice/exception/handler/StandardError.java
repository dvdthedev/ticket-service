package dev.dvd.ticketservice.exception.handler;

public record StandardError(
        Long timestamp,
        Integer status,
        String error,
        String message,
        String path
) {}