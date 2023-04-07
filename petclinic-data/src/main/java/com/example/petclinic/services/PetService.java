package com.example.petclinic.services;

import com.example.petclinic.model.BaseEntity;
import com.example.petclinic.model.Pet;

public interface PetService<P extends BaseEntity, L extends Number> extends CrudService<Pet, Long>{

}
