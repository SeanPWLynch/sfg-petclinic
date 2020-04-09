package com.boanntech.sfgpetclinic.repositories;

import com.boanntech.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {

}
