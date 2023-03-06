package com.example.petclinic.services;

import com.example.petclinic.model.Pet;
import com.example.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
