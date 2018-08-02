package za.ac.cput.dogpounddomain.Domain;

//import java.sql.Date;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class DateTimeRange {
    private java.util.Date startDate;
    private java.util.Date endDate;
    private Time startTime;
    private Time endTime;

    public java.util.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
