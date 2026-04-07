package com.Aryan.SimpleWebApp.service;

import com.Aryan.SimpleWebApp.model.Alien;
import com.Aryan.SimpleWebApp.repository.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlienService {
    @Autowired
    AlienRepo repo;

    public List<Alien> getAliens() {
        return repo.findAll();
    }

    public Alien getAlienById(int id) {
        return repo.findById(id).orElse(new Alien());
    }

    public void addAlien(Alien alien) {
        repo.save(alien);
    }

    public void updateAlien(Alien alien) {
        repo.save(alien);
    }

    public void deleteAlien(int id) {
        repo.deleteById(id);
    }
}
