package com.boanntech.sfgpetclinic.services.map;

import com.boanntech.sfgpetclinic.model.Speciality;
import com.boanntech.sfgpetclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService
{
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteByID(Id);
    }

}
