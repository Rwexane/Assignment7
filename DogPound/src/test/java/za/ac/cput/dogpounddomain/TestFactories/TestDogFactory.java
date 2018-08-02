package za.ac.cput.dogpounddomain.TestFactories;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.dogpounddomain.Domain.Adoption;
import za.ac.cput.dogpounddomain.Domain.Dog;
import za.ac.cput.dogpounddomain.Domain.Schedule;
import za.ac.cput.dogpounddomain.Factories.DogFactory;

import java.util.List;

public class TestDogFactory {

    @Test
    public void testCreate()
    {
        Adoption adoption = new Adoption.Builder("Bulelani's Family").build();
        List<Schedule> schedules = null;
        DogFactory factory = new DogFactory();
        Dog original = factory.createDog("Hulk",100, schedules, "PitBul");

        Assert.assertEquals(original.getDogId(), 100);
    }


    @Test
    public void testUpdate()
    {
        Adoption adoption = new Adoption.Builder("Bulelani's Family").build();
        List<Schedule> schedules = null;
        DogFactory factory = new DogFactory();
        Dog original = factory.createDog("Hulk",100, schedules, "Dog");
        Dog copy = new Dog.Builder("Hulk 1").copy(original).dogId(101).build();

        Assert.assertEquals(original.getDogId(), 100);
        Assert.assertEquals(copy.getDogId(), 101);
        Assert.assertEquals(copy.getBreed(), original.getBreed());
    }

}
