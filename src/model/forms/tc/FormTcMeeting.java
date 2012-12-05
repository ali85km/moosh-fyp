package model.forms.tc;

public class FormTcMeeting {

    private Meeting meetingWeek1;
    private Meeting meetingWeek2;
    private Meeting meetingWeek3;
    private Meeting meetingWeek4;

    public FormTcMeeting(String parameter, String parameter2,
			String parameter3, String parameter4, String parameter5,
			String parameter6, String parameter7, String parameter8,
			String parameter9, String parameter10, String parameter11,
			String parameter12, String parameter13, String parameter14,
			String parameter15, String parameter16, String parameter17,
			String parameter18, String parameter19, String parameter20,
			String parameter21, String parameter22, String parameter23,
			String parameter24) {
		// TODO Auto-generated constructor stub
	}

	public Meeting getMeetingWeek1() {
        return this.meetingWeek1;
    }

    public Meeting getMeetingWeek2() {
        return this.meetingWeek2;
    }

    public Meeting getMeetingWeek3() {
        return this.meetingWeek3;
    }

    public Meeting getMeetingWeek4() {
        return this.meetingWeek4;
    }

    public class Meeting {

        private int audioConduct;
        private int audioAttend;
        private int videoConduct;
        private int videoAttend;
        private int facetofaceConduct;
        private int facetofaceAttend;

        public int getAudioAttend() {
            return this.audioAttend;
        }

        public int getAudioConduct() {
            return this.audioConduct;
        }

        public int getFacetofaceAttend() {
            return this.facetofaceAttend;
        }

        public int getFacetofaceConduct() {
            return this.facetofaceConduct;
        }

        public int getVideoAttend() {
            return this.videoAttend;
        }

        public int getVideoConduct() {
            return this.videoConduct;
        }
    }
}
