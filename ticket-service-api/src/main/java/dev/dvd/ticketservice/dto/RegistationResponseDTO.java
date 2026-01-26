package dev.dvd.ticketservice.dto;

public record RegistationResponseDTO(
        Long id,
        String eventName,
        String attendeeName,
        boolean checkedIn,
        String qrCodePath
) {
}
