package com.codewithchirag.store.repositories;

import com.codewithchirag.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}