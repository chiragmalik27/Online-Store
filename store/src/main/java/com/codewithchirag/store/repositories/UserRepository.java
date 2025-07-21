package com.codewithchirag.store.repositories;

import com.codewithchirag.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
