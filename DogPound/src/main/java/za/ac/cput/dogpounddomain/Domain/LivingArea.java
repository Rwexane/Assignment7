package za.ac.cput.dogpounddomain.Domain;

import java.io.Serializable;
import java.util.List;

public class LivingArea implements Serializable {
    private int livingAreaId;
    private String name;
    private String code;
    private boolean active;
    private int spaceAvailable;
    private List<Dog> dogs;

    public LivingArea(Builder value)
    {
        this.livingAreaId = value.livingAreaId;
        this.name = value.name;
        this.spaceAvailable = value.spaceAvailable;
        this.dogs = value.dogs;
    }

    public int getSpaceAvailable() {
        return spaceAvailable;
    }

    public List<Dog> getAnimals() {
        return dogs;
    }

    public int getLivingAreaId() {
        return livingAreaId;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean isActive() {
        return active;
    }

    public static class Builder {
        int livingAreaId;
        String name;
        String code;
        int spaceAvailable;
        boolean active;
        List<Dog> dogs;

        public Builder(String name) {
            this.name = name;
        }

        public Builder livingAreaId(int livingAreaId) {
            this.livingAreaId = livingAreaId;
            return this;
        }

        public Builder spaceAvailable(int spaceAvailable) {
            this.spaceAvailable = spaceAvailable;
            return this;
        }

        public Builder animals(List<Dog> dogs) {
            this.dogs = dogs;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder copy(LivingArea value)
        {
            this.livingAreaId = value.livingAreaId;
            this.name = value.name;
            this.code = value.code;
            this.active = value.active;
            this.spaceAvailable = value.spaceAvailable;
            this.dogs = value.dogs;
            return this;
        }

        public LivingArea build()
        {
            return new LivingArea(this);
        }
    }
}