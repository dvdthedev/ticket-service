package dev.dvd.ticketservice.model;

import dev.dvd.ticketservice.dto.EventRequestDTO;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private String venue;

    @OneToMany(mappedBy = "event")
    private List<Registration> registrationList = new ArrayList<>();

    public Event(EventRequestDTO registrationData) {
        this.date = registrationData.date();
        this.venue = registrationData.venue();
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public List<Registration> getRegistrationList() {
        return registrationList;
    }
}
