package za.ac.cput.dogpounddomain.TestFactories;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestScheduleTypeFactory {
    @Test
    public void testCreate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactory factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("Morning001",true, schedules);

        Assert.assertEquals("Morning001", original.getCode());
    }

    @Test
    public void testUpdate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactory factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("Morning001",true, schedules);
        ScheduleType copy = new ScheduleType.Builder("Afternoon").copy(original).active(false).build();

        Assert.assertEquals(false, copy.isActive());
        Assert.assertEquals(true, original.isActive());
        Assert.assertEquals(original.getCode(), copy.getCode());
    }
}

