package com.spring.petclinic.service;

import com.spring.petclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {
    Owner findByLastName(String lastName);
}
