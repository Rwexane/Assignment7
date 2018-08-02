package za.ac.cput.dogpounddomain.TestFactories;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.dogpounddomain.Domain.Dog;
import za.ac.cput.dogpounddomain.Domain.LivingArea;
import za.ac.cput.dogpounddomain.Factories.LivingAreaFactory;

import java.util.List;

public class TestLivingAreaFactory {
    @Test
    public void testCreate()
    {
        List<Dog> dogs = null;
        LivingAreaFactory factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea(0, "Kennels", "60", dogs);

        Assert.assertEquals(0, original.getSpaceAvailable());
    }

    @Test
    public void testUpdate()
    {
        List<Dog> dogs = null;
        LivingAreaFactory factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea(0, "Kennels","60", dogs);
        LivingArea copy = new LivingArea.Builder("Cages").copy(original).spaceAvailable(45).build();

        Assert.assertEquals(45, copy.getSpaceAvailable());
        Assert.assertEquals(0, original.getSpaceAvailable());
        Assert.assertEquals(original.getName(), copy.getName());
    }

}
