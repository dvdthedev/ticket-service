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

    @GetMapping({"/{id}"})
    public ResponseEntity<EventResponseDTO> getEvent(@PathVariable Long id){
        EventResponseDTO response = eventService.get(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<EventResponseDTO> createEvent(@RequestBody EventRequestDTO registrationData){
        EventResponseDTO response = eventService.create(registrationData);
        return ResponseEntity.ok(response);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<EventResponseDTO> updateEvent(@PathVariable Long id, @RequestBody EventRequestDTO registrationData){
        EventResponseDTO response = eventService.update(id, registrationData);
        return ResponseEntity.ok(response);
    }

    /*  --- Criar campos de evento desativado no banco de dados
    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id){
        eventService.deleteById(id);
    }

     */
}
