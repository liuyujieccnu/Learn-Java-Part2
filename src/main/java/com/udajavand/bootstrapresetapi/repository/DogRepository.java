package com.udajavand.bootstrapresetapi.repository;

import com.udajavand.bootstrapresetapi.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
