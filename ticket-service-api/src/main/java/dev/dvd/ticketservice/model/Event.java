package dev.dvd.ticketservice.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private String venue;

    @OneToMany(mappedBy = "event")
    private List<Registration> registrationList;
}
