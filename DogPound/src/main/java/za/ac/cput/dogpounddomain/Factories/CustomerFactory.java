package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Customer;

import java.util.HashMap;

public class CustomerFactory {
    //singleton
    private static CustomerFactory instance=null;

    public CustomerFactory(){}

    public static CustomerFactory getInstance(){
        if (instance == null) {
            instance = new CustomerFactory();
        }
        return instance;
    }

    public static Customer createCustomer(HashMap<String, String> id, String name,
                                          String surname)
    {
        return new Customer.Builder()
                .Id(id)
                .CustName(name)
                .CustSurname(surname)
                .build();
    }
}
   /* public static Dog createDog(String name,
                                int dogId,
                                List<Schedule> schedules,
                                String breed)
    {
        return new Dog.Builder(name)
                .dogId(dogId)
                .breed(breed)
                .schedules(schedules)
                .build();
    }*/