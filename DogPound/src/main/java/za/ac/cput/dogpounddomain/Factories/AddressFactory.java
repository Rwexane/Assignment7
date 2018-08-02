package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Address;

public class AddressFactory{

    //singleton
    private static AddressFactory instance=null;

    public AddressFactory(){}

    public static AddressFactory getInstance() {
        if (instance == null) {
            instance = new AddressFactory();

        }
        return instance;
    }



    public static Address createAdress(String room,
                                       String street,
                                       String surbub,
                                       String zipCode)
    {

        Address myAddress = new Address.Builder(room)
                .street(street)
                .surbub(surbub)
                .zipCode(zipCode)
                .build();
        return myAddress;
    }
}
