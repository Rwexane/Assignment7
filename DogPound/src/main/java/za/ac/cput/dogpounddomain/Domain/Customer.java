package za.ac.cput.dogpounddomain.Domain;

import java.io.Serializable;
import java.util.HashMap;

public class Customer implements Serializable {
    private HashMap<String, String> Id;
    private String custNumber;
    private String custName;
    private String custSurname;


    private Adoption adopt;

    private Address Adress;


    private Customer() {
    }


    private Customer(Builder build)
    {
        Id = build.Id;
        adopt = build.adopt;
        custName = build.custName;
        custSurname = build.custSurname;
        custNumber = build.custNumber;
        Adress = build.adress;

    }


    public static class Builder{

        private HashMap<String, String> Id;
        private String custName;
        private String custNumber;
        private String custSurname;
        private Adoption adopt;
        private Address adress;

        public Builder() {
            this.custNumber = custNumber;
        }

        public Builder Adress (Address addr){
            this.adress = addr;
            return this;
        }
        public Builder Id(HashMap<String, String> id) {
            this.Id = id;
            return this;
        }

        public Builder CustName(String custName) {
            this.custName = custName;
            return this;
        }

        public Builder CustSurname(String custSurname) {
            this.custSurname = custSurname;
            return this;
        }
        public Builder Adopt(Adoption adopt) {
            this.adopt = adopt;
            return this;
        }

        public Builder customer(Customer cust)
        {
            adopt = cust.getAdopt();
            custName = cust.getCustName();
            custNumber = cust.getCustNumber();
            custSurname = cust.getCustSurname();
            Id = cust.getID();
            adress = cust.getAdress();
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }

    public Address getAdress()
    {
        return Adress;
    }
    public HashMap<String, String> getID()
    {
        return Id;
    }
    public String getCustName() {
        return custName;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public String getCustSurname() {
        return custSurname;
    }


    public Adoption getAdopt() {
        return adopt;
    }

}

