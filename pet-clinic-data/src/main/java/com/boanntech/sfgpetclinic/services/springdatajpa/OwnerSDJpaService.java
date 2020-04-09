package com.boanntech.sfgpetclinic.services.springdatajpa;


import com.boanntech.sfgpetclinic.model.Owner;
import com.boanntech.sfgpetclinic.repositories.OwnerRepository;
import com.boanntech.sfgpetclinic.repositories.PetRepository;
import com.boanntech.sfgpetclinic.repositories.PetTypeRepository;
import com.boanntech.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long Id) {
        Optional<Owner> optionalOwner = ownerRepository.findById(Id);

        return ownerRepository.findById(Id).orElse(null);

    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long Id) {
        ownerRepository.deleteById(Id);
    }
}
