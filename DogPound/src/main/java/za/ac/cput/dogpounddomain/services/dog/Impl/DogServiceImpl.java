package za.ac.cput.dogpounddomain.services.dog.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.dogpounddomain.Domain.Dog;
import za.ac.cput.dogpounddomain.Repository.customer.DogRepository;
import za.ac.cput.dogpounddomain.services.dog.DogService;
//import java.util.Optional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository repository;

    @Override
    public Dog create(Dog entity) {
        return repository.save(entity);
    }

    @Override
    public Dog readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Dog> readAll(){

        List<Dog>  dogList = new ArrayList<Dog>();
        Iterable<Dog>dogs = repository.findAll();
        for(Dog dog : dogs) {
            dogList.add(dog);
        }
        return dogList;
    }

    @Override
    public Dog update(Dog entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Dog entity) {
        repository.delete(entity);

    }
}

