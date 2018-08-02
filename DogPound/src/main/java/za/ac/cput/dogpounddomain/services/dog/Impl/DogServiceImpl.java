package za.ac.cput.dogpounddomain.services.dog.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.dogpounddomain.Domain.Dog;
import za.ac.cput.dogpounddomain.Repository.dog.DogRepository;
import za.ac.cput.dogpounddomain.services.dog.DogService;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    private DogRepository repository;

    @Override
    public Dog findById(Long id) {
        return (Dog) repository.findAll();
    }

    @Override
    public Dog save(Dog entity) {
        return repository.save(entity);
    }

    @Override
    public Dog update(Dog entity) {
        return repository.save(entity);

    }

    @Override
    public void delete(Dog entity) {
        repository.delete(entity);
    }

    @Override
    public List<Dog> findAll() {
        List<Dog> dogs = new ArrayList<Dog>();
        Iterable<Dog> values = repository.findAll();

        for(Dog value: values ){
            dogs.add(value);
        }
        return dogs;
    }

}
