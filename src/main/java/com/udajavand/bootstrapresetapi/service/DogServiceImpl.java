package com.udajavand.bootstrapresetapi.service;

import com.udajavand.bootstrapresetapi.entity.Dog;
import com.udajavand.bootstrapresetapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs(){
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed(){
        return (List<String>) dogRepository.findAllBreed();
    }

    public String resolveDogBreedById(Long id){
        return (String) dogRepository.findBreedById(id);
    }

    public List<String> retrieveDogNames(){
        return (List<String>) dogRepository.findAllNames();
    }
}
