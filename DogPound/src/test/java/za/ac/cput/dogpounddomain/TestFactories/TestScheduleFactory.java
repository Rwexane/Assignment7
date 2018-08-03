package za.ac.cput.dogpounddomain.TestFactories;

import org.junit.Assert;
import org.junit.Test;

public class TestScheduleFactory {

    @Test
    public void testName() throws Exception {
        ScheduleFactory factory = new ScheduleFactory();
        Schedule testObject = factory.createSchedule("Bathing", 0, new DateTimeRange());

        Assert.assertEquals("Bathing", testObject.getActivity());
    }

    @Test
    public void testUpdate()
    {
        ScheduleFactory factory = new ScheduleFactory();
        Schedule original = factory.createSchedule("Bathing", 0, new DateTimeRange());
        Schedule copy = new Schedule.Builder("Feeding").copy(original).scheduleId(5).build();

        Assert.assertEquals(0, original.getScheduleId());
        Assert.assertEquals(5, copy.getScheduleId());

    }
}
