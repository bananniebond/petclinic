package com.example.petclinic.services;

import com.example.petclinic.model.Person;
import com.example.petclinic.model.Vet;

public interface VetService<V extends Person, L extends Number> extends CrudService<Vet, Long>{
}
