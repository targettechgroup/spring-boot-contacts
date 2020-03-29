package com.targettech.springboot.crud.repositories;

import com.targettech.springboot.crud.entities.Contact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
