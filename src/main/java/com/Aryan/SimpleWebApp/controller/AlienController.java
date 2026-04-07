package com.Aryan.SimpleWebApp.controller;

import com.Aryan.SimpleWebApp.model.Alien;
import com.Aryan.SimpleWebApp.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienService service;

    @GetMapping("/aliens")
    public List<Alien> getAliens() {
        return service.getAliens();
    }

    @GetMapping("/aliens/{id}")
    public Alien getAlienById(@PathVariable("id") int id) {
        return service.getAlienById(id);
    }

    @PostMapping("/aliens")
    public Alien addAlien(@RequestBody Alien alien) {
        service.addAlien(alien);
        return service.getAlienById(alien.getId());
    }

    @PutMapping("/aliens")
    public void updateAlien(@RequestBody Alien alien) {
        service.updateAlien(alien);
    }

    @DeleteMapping("/aliens/{id}")
    public void deleteAlien(@PathVariable("id") int id) {
        service.deleteAlien(id);
    }
}
