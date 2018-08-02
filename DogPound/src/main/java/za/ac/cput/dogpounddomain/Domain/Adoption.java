package za.ac.cput.dogpounddomain.Domain;

import java.io.Serializable;
import java.util.Date;

public class Adoption implements Serializable {
    private String comment;
    private int adoptionId;
    private Date adoptionDate;

    public Adoption(Builder value)
    {
        this.adoptionId = value.adoptionId;
        this.comment = value.comment;
        this.adoptionDate = value.adoptionDate;
    }

    public String getComment() {
        return comment;
    }

    public int getAdoptionId() {
        return adoptionId;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public static class Builder{
        String comment;
        int adoptionId;
        Date adoptionDate;

        public Builder(String comment) {
            this.comment = comment;
        }

        public Builder adoptionId(int adoptionId) {
            this.adoptionId = adoptionId;
            return this;
        }


        public Builder adoptionDate(Date adoptionDate) {
            this.adoptionDate = adoptionDate;
            return this;
        }

        public Builder copy(Adoption value)
        {
            this.adoptionId = value.adoptionId;
            this.comment = value.comment;
            this.adoptionDate = value.adoptionDate;
            return this;
        }

        public Adoption build(){
            return new Adoption(this);
        }
    }
}