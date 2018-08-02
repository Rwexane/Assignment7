package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Adoption;

import java.util.Date;

public class AdoptionFactory {

    //singleton
    private static AdoptionFactory instance=null;

    public AdoptionFactory(){}

    public static AdoptionFactory getInstance(){
        if (instance == null) {
            instance = new AdoptionFactory();
        }
        return instance;
    }

    public static Adoption createAdoption(String comment,
                                          int adoptionId,
                                          Date adoptionDate)
    {
        return new Adoption.Builder(comment)
                .adoptionDate(adoptionDate)
                .adoptionId(adoptionId)
                .build();
    }
}