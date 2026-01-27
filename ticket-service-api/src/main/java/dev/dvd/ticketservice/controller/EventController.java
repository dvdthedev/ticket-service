package dev.dvd.ticketservice.controller;

import dev.dvd.ticketservice.dto.EventRequestDTO;

import dev.dvd.ticketservice.dto.EventResponseDTO;
import dev.dvd.ticketservice.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {
    private EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping
    public ResponseEntity<EventResponseDTO> create(@RequestBody EventRequestDTO registrationData){
        EventResponseDTO response = eventService.create(registrationData);
        return ResponseEntity.ok(response);
    }
}
