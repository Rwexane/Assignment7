package za.ac.cput.dogpounddomain.Domain;

import java.io.Serializable;
import java.util.List;

public class Dog implements Serializable {
    private String breed;
    private int dogId;
    private double weight;
    private List<Schedule> schedules;

    public Dog(Builder value)
    {
        this.breed = value.breed;
        this.dogId = value.dogId;
        this.weight = value.weight;
    }

    public String getbreed() {
        return breed;
    }

    public int getDogId() {
        return dogId;
    }


    public double getWeight() {
        return weight;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public String getBreed() {
        return breed;
    }

    public static class Builder{
        String breed;
        int dogId;
        double weight;
        List<Schedule> schedules;

        public Builder(String breed) {
            this.breed = breed;
        }

        public Builder dogId(int dogId) {
            this.dogId = dogId;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }
        public Builder breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder schedules(List<Schedule> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder copy(Dog value)
        {
            this.breed = value.breed;
            this.dogId = value.dogId;
            this.weight = value.weight;
            return this;
        }

        public Dog build()
        {
            return new Dog(this);
        }

    }
}
