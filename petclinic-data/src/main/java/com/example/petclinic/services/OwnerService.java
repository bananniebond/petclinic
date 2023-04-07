package com.example.petclinic.services;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Person;

public interface OwnerService<O extends Person, L extends Number> extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}
