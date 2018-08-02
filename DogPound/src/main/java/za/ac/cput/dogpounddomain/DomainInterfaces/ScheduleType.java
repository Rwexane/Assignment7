package za.ac.cput.dogpounddomain.DomainInterfaces;

import za.ac.cput.dogpounddomain.Domain.Schedule;
import java.util.List;

public interface ScheduleType {
    int getScheduleTypeId();
    String getName();
    boolean isActive();
    List<Schedule> getSchedules();
}
