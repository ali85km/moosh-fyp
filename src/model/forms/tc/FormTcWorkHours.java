package model.forms.tc;

public class FormTcWorkHours {

    private WeekWorkHours workHoursWeek1;
    private WeekWorkHours workHoursWeek2;
    private WeekWorkHours workHoursWeek3;
    private WeekWorkHours workHoursWeek4;

    public WeekWorkHours getWorkHoursWeek1() {
        return this.workHoursWeek1;
    }

    public WeekWorkHours getWorkHoursWeek2() {
        return this.workHoursWeek2;
    }

    public WeekWorkHours getWorkHoursWeek3() {
        return this.workHoursWeek3;
    }

    public WeekWorkHours getWorkHoursWeek4() {
        return this.workHoursWeek4;
    }

    public class WeekWorkHours {

        private int mondayHour;
        private int tuesdayHour;
        private int wednesdayHour;
        private int thursdayHour;
        private int fridayHour;
        private int saturdayHour;

        public int getFridayHour() {
            return this.fridayHour;
        }

        public int getMondayHour() {
            return this.mondayHour;
        }

        public int getSaturdayHour() {
            return this.saturdayHour;
        }

        public int getThursdayHour() {
            return this.thursdayHour;
        }

        public int getTuesdayHour() {
            return this.tuesdayHour;
        }

        public int getWednesdayHour() {
            return this.wednesdayHour;
        }
    }
}
