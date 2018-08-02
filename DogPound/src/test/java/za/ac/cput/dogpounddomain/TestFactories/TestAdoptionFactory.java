package za.ac.cput.dogpounddomain.TestFactories;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.dogpounddomain.Domain.Adoption;
import za.ac.cput.dogpounddomain.Factories.AdoptionFactory;

import java.util.Date;

public class TestAdoptionFactory {
    @Test
    public void testCreate()
    {
        AdoptionFactory factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", 0, new Date(2018,03,24));

        Assert.assertEquals(0, original.getAdoptionId());
    }

    @Test
    public void testUpdate()
    {
        AdoptionFactory factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", 0, new Date(2018,03,24));
        Adoption copy = new Adoption.Builder("New Dog").copy(original).adoptionId(5).build();

        Assert.assertEquals(0, original.getAdoptionId());
        Assert.assertEquals(5, copy.getAdoptionId());
        Assert.assertEquals(original.getAdoptionDate(), copy.getAdoptionDate());
    }
}
