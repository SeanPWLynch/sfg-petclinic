package com.boanntech.sfgpetclinic.services.map;

import com.boanntech.sfgpetclinic.model.Owner;
import com.boanntech.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap<T, ID> extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteByID(Id);
    }

}
