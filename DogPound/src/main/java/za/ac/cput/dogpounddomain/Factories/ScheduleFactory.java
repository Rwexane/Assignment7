package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.DateTimeRange;
import za.ac.cput.dogpounddomain.Domain.Schedule;

public class ScheduleFactory {

    //singleton
    private static ScheduleFactory instance=null;

    public ScheduleFactory(){}

    public static ScheduleFactory getInstance(){
        if (instance == null) {
            instance = new ScheduleFactory();
        }
        return instance;
    }

    public static Schedule createSchedule(String activity,
                                          int scheduleId,
                                          DateTimeRange dtr)
    {
        return new Schedule.Builder(activity)
                .scheduleId(scheduleId)
                .dateTimeRange(dtr)
                .build();
    }

}
