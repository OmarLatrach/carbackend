package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
