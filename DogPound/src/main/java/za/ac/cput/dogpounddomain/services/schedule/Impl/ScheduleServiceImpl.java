package za.ac.cput.dogpounddomain.services.schedule.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.dogpounddomain.Domain.Schedule;
import za.ac.cput.dogpounddomain.Repository.schedule.ScheduleRepository;
import za.ac.cput.dogpounddomain.services.schedule.ScheduleService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepository repository;

    @Override
    public Schedule findById(Long id) {
        return (Schedule) repository.findAll();
    }

    @Override
    public Schedule save(Schedule entity) {
        return repository.save(entity);
    }

    @Override
    public Schedule update(Schedule entity) {
        return repository.save(entity);

    }

    @Override
    public void delete(Schedule entity) {
        repository.delete(entity);
    }

    @Override
    public List<Schedule> findAll() {
        List<Schedule> schedules = new ArrayList<Schedule>();
        Iterable<Schedule> values = repository.findAll();

        for(Schedule value: values ){
            schedules.add(value);
        }
        return schedules;
    }

}