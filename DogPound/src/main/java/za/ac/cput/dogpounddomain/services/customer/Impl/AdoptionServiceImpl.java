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
    AdoptionRepository repository;

    @Override
    public Adoption create(Adoption entity) {
        return repository.save(entity);
    }

    @Override
    public Adoption readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Adoption> readAll(){

        List<Adoption>  adoptionList = new ArrayList<Adoption>();
        Iterable<Adoption>adoptions = repository.findAll();
        for(Adoption adoption : adoptions) {
            adoptionList.add(adoption);
        }
        return adoptionList;
    }

    @Override
    public Adoption update(Adoption entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Adoption entity) {
        repository.delete(entity);

    }
}
