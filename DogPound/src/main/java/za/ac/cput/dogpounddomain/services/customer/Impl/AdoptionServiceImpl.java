package za.ac.cput.dogpounddomain.services.customer.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.dogpounddomain.Domain.Adoption;
import za.ac.cput.dogpounddomain.Repository.customer.AdoptionRepository;
import za.ac.cput.dogpounddomain.services.customer.AdoptionService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdoptionServiceImpl implements AdoptionService {

    @Autowired
    private AdoptionRepository repository;

    @Override
    public Adoption findById(Long id) {
        return (Adoption) repository.findAll();
    }

    @Override
    public Adoption save(Adoption entity) {
        return repository.save(entity);
    }

    @Override
    public Adoption update(Adoption entity) {
        return repository.save(entity);

    }

    @Override
    public void delete(Adoption entity) {
        repository.delete(entity);
    }

    @Override
    public List<Adoption> findAll() {
        List<Adoption> adoptions = new ArrayList<Adoption>();
        Iterable<Adoption> values = repository.findAll();

        for(Adoption value: values ){
            adoptions.add(value);
        }
        return adoptions;
    }

}