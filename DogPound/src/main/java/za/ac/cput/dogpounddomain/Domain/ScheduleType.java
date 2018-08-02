package za.ac.cput.dogpounddomain.Domain;

import za.ac.cput.dogpounddomain.DomainInterfaces.*;
import java.io.Serializable;
import java.util.List;
import java.util.zip.*;

public class ScheduleType implements Serializable {
    private String code;
    private boolean active;
    private List<Schedule> schedules;

    public ScheduleType(Builder value)
    {
        this.code = value.code;
        this.active = value.active;
        this.schedules = value.schedules;

    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public String getCode() {
        return code;
    }

    public boolean isActive() {
        return active;
    }

    public static class Builder{
        String code;
        boolean active;
        List<Schedule> schedules;

        public Builder(String code) {
            this.code = code;
        }

        public Builder schedules(List<Schedule> schedules) {
            this.schedules = schedules;
            return this;
        }
        public Builder code(String code){
            this.code = code;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder copy(ScheduleType value)
        {
            this.code = value.code;
            this.active = value.active;
            this.schedules  = value.schedules;

            return this;
        }

        public ScheduleType build()
        {
            return new ScheduleType(this);
        }
    }
}
