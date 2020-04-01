package com.boanntech.sfgpetclinic.services.map;

import com.boanntech.sfgpetclinic.model.Vet;
import com.boanntech.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap<T, ID> extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteByID(Id);
    }

}
