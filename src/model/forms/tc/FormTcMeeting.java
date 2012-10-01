package model.forms.tc;

public class FormTcMeeting {

    private Meeting meetingWeek1;
    private Meeting meetingWeek2;
    private Meeting meetingWeek3;
    private Meeting meetingWeek4;

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

        private int audioTotal;
        private int audioAttend;
        private int videoTotal;
        private int videoAttend;
        private int facetofaceConduct;
        private int facetofaceAttend;

        public int getAudioAttend() {
            return this.audioAttend;
        }

        public int getAudioTotal() {
            return this.audioTotal;
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

        public int getVideoTotal() {
            return this.videoTotal;
        }
    }
}
