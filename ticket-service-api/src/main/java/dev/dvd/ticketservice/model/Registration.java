package dev.dvd.ticketservice.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "attendee_id")
    private Attendee attendee;

    private LocalDateTime registrationDate;

    private boolean checkedIn = false;

    private String qrCodePath;
}
