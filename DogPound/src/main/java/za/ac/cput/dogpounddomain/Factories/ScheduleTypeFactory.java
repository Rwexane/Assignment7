package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Schedule;
import za.ac.cput.dogpounddomain.Domain.ScheduleType;
import za.ac.cput.dogpounddomain.Domain.*;

import java.util.List;

public class ScheduleTypeFactory {

    //singleton
    private static ScheduleTypeFactory instance=null;

    public ScheduleTypeFactory(){}

    public static ScheduleTypeFactory getInstance(){
        if (instance == null) {
            instance = new ScheduleTypeFactory();
        }
        return instance;
    }
    public static ScheduleType createScheduleType(
            String code,
            boolean active,
            List<Schedule> schedules)
    {
        return new ScheduleType.Builder(code)
                .active(active)
                .schedules(schedules)
                .build();
    }
}