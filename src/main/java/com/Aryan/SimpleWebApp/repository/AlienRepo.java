package com.Aryan.SimpleWebApp.repository;

import com.Aryan.SimpleWebApp.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienRepo extends JpaRepository<Alien, Integer> {
}
