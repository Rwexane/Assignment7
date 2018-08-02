package za.ac.cput.dogpounddomain.services.dog.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.dogpounddomain.Domain.LivingArea;
import za.ac.cput.dogpounddomain.Repository.dog.LivingAreaRepository;
import za.ac.cput.dogpounddomain.services.dog.LivingAreaService;
import org.springframework.beans.factory.annotation.Autowired;


import javax.naming.Context;
import java.util.ArrayList;
import java.util.List;

@Service
public class LivingAreaServiceImpl implements LivingAreaService {

        @Autowired
        private LivingAreaRepository repository;

        @Override
        public LivingArea findById(Long id) {
            return (LivingArea) repository.findAll();
        }

        @Override
        public LivingArea save(LivingArea entity) {
            return repository.save(entity);
        }

        @Override
        public LivingArea update(LivingArea entity) {
            return repository.save(entity);

        }

        @Override
        public void delete(LivingArea entity) {
            repository.delete(entity);
        }

        @Override
        public List<LivingArea> findAll() {
            List<LivingArea> livingAreas = new ArrayList<LivingArea>();
            Iterable<LivingArea> values = repository.findAll();

            for(LivingArea value: values ){
                livingAreas.add(value);
            }
            return livingAreas;
        }

 }

