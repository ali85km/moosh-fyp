package model.forms.tc;

public class FormTcWorkHours {

    private WeekWorkHours workHoursWeek1;
    private WeekWorkHours workHoursWeek2;
    private WeekWorkHours workHoursWeek3;
    private WeekWorkHours workHoursWeek4;
    private WeekWorkHours workHoursTotal;

    public FormTcWorkHours(String parameter, String parameter2,
			String parameter3, String parameter4, String parameter5,
			String parameter6, String parameter7, String parameter8,
			String parameter9, String parameter10, String parameter11,
			String parameter12, String parameter13, String parameter14,
			String parameter15, String parameter16, String parameter17,
			String parameter18, String parameter19, String parameter20,
			String parameter21, String parameter22, String parameter23,
			String parameter24, String parameter25, String parameter26,
			String parameter27, String parameter28, String parameter29,
			String parameter30, String parameter31, String parameter32) {
		// TODO Auto-generated constructor stub
	}

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

    public WeekWorkHours getWorkHoursTotal() {
		return workHoursTotal;
	}

	public void setWorkHoursTotal(WeekWorkHours workHoursTotal) {
		this.workHoursTotal = workHoursTotal;
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
