package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Dog;

public class DogFactory{
    public static Dog createDog(String name,
                                String breed,
                                String livingArea)
    {
        return new Dog.Builder()
                .name(name)
                .breed(breed)
                .livingArea(livingArea)
                .build();
    }
}
