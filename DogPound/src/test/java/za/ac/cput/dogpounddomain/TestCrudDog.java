//
////package za.ac.cput;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.testng.annotations.Test;
//import za.ac.cput.domain.Dog;
//import za.ac.cput.factories.dog.DogFactory;
//import za.ac.cput.repository.dog.DogRepo;
//
////@SpringApplicationConfiguration(classes =App.class)
////@WebAppConfiguration
////public class TestCrudDog  extends AbstractTestNGSpringContextTests {
////
////    @Autowired
////    DogRepo myrepo;
////    private long id;
////    @Test
////    public void create() throws Exception
////    {
////        Dog myDog = DogFactory.createDog("Sheep","Whitty","Kraal");
////        myrepo.save(myDog);
////    }
////    @Test(dependsOnMethods = "create")
////    public void read() throws Exception
////    {
////
////    }
////}
