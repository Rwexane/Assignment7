package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Adoption;

public class AdoptionFactory {
    public static Adoption createAdoption(String dogName, String customerName,
                                          String customerSurname, String date)
    {
        Adoption adoption = new Adoption.Builder()
                .dogName(dogName)
                .customerName(customerName)
                .customerSurname(customerSurname)
                .date(date)
                .build();
        return adoption;
    }
}
