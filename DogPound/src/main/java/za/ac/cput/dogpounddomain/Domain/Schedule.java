package za.ac.cput.dogpounddomain.Domain;

import java.io.Serializable;

public class Schedule implements Serializable {
        private String activity;
        private int scheduleId;
        private DateTimeRange dtr;

        public Schedule() {
        }

        public Schedule(Builder value)
        {
            this.activity = value.activity;
            this.dtr = value.dtr;
            this.scheduleId = value.scheduleId;
        }

        public String getActivity() {
            return activity;
        }

        public int getScheduleId() {
            return scheduleId;
        }

        public DateTimeRange getDtr() {
            return dtr;
        }

        public static class Builder{
            String activity;
            int scheduleId;
            DateTimeRange dtr;

            public Builder(String activity) {
                this.activity = activity;
            }

            public Builder scheduleId(int scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            public Builder dateTimeRange(DateTimeRange dtr) {
                this.dtr = dtr;
                return this;
            }

            public Builder copy(Schedule value)
            {
                this.activity = value.activity;
                this.dtr = value.dtr;
                this.scheduleId = value.scheduleId;
                return this;
            }

            public Schedule build(){
                return new Schedule(this);
            }
        }
}

