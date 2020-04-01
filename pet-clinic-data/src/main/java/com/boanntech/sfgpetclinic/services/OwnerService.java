package com.boanntech.sfgpetclinic.services;

import com.boanntech.sfgpetclinic.model.Owner;


public interface OwnerService  extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
