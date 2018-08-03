package za.ac.cput.dogpounddomain.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Adoption implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private  String dogName;
    private  String customerName;
    private  String customerSurname;
    private String date;

    public long getId() {
        return id;
    }

    public String getDogName(){
        return dogName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerSurname(){
        return customerSurname;
    }
    public String getDate() {
        return date;
    }

    public Adoption()
    {

    }

    public Adoption(Builder builder) {
        id = builder.id;
        dogName = builder.dogName;
        customerName = builder.customerName;
        customerSurname = builder.customerSurname;
        date = builder.date;

    }
    public static class Builder {
        //Equivalent to setters
        private long id;
        private String dogName;
        private String customerName;
        private String customerSurname;
        private String date;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder dogName(String dogName) {
            this.dogName = dogName; //compulsary
            return this;
        }
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerSurname(String customerSurname) {
            this.customerSurname = customerSurname;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder copy(Adoption adoption){
            this.id = adoption.getId();
            this.dogName = adoption.getDogName();
            this.customerName = adoption.getCustomerName();
            this.customerSurname = adoption.getCustomerSurname();
            this.date = adoption.date;

            return this;
        }
        public Adoption build() {
            return new Adoption(this);
        }
    }

    /*public String toString()
    {
        return String.format("Id : %d\ncustomerName :%s\ndogName :%s\nPersalNumber :%s",id,name,surname,persalNumber);
    }*/


}