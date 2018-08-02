package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Dog;
import za.ac.cput.dogpounddomain.Domain.Schedule;

import java.util.List;

public class DogFactory {

    //singleton
    private static DogFactory instance=null;

    public DogFactory(){}

    public static DogFactory getInstance(){
        if (instance == null) {
            instance = new DogFactory();
        }
        return instance;
    }
    public static Dog createDog(String name,
                                int dogId,
                                List<Schedule> schedules,
                                String breed)
    {
        return new Dog.Builder(name)
                .dogId(dogId)
                .breed(breed)
                .schedules(schedules)
                .build();
    }
}
