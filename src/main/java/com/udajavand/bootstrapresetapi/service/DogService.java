package com.udajavand.bootstrapresetapi.service;

import com.udajavand.bootstrapresetapi.entity.Dog;

import java.util.List;

public interface DogService {

    List<Dog> retrieveDogs();

    List<String> retrieveDogBreed();

    String resolveDogBreedById(Long id);

    List<String> retrieveDogNames();

}
