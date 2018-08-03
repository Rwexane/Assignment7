package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Customer;

public class CustomerFactory {


    public static Customer createCustomer(String name, String surname, String phoneNumber)
    {
        return new Customer.Builder()
                .name(name)
                .surname(surname)
                .phoneNumber(phoneNumber)
                .build();
    }

}
