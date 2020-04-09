package com.boanntech.sfgpetclinic.services.map;

import com.boanntech.sfgpetclinic.model.Pet;
import com.boanntech.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteByID(Id);
    }

}
