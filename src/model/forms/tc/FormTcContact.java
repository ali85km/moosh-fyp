package model.forms.tc;

public class FormTcContact {

    private Contact contactWeek1;
    private Contact contactWeek2;
    private Contact contactWeek3;
    private Contact contactWeek4;

    public FormTcContact(String parameter, String parameter2,
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

	public Contact getContactWeek1() {
        return this.contactWeek1;
    }

    public Contact getContactWeek2() {
        return this.contactWeek2;
    }

    public Contact getContactWeek3() {
        return this.contactWeek3;
    }

    public Contact getContactWeek4() {
        return this.contactWeek4;
    }

    public class Contact {

        private int emailReceive;
        private int emailReplay;
        private int phoneReceive;
        private int phoneReplay;
        private int smsReceive;
        private int smsReplay;

        public int getEmailReceive() {
            return this.emailReceive;
        }

        public int getEmailReplay() {
            return this.emailReplay;
        }

        public int getPhoneReceive() {
            return this.phoneReceive;
        }

        public int getPhoneReplay() {
            return this.phoneReplay;
        }

        public int getSmsReceive() {
            return this.smsReceive;
        }

        public int getSmsReplay() {
            return this.smsReplay;
        }
    }
}
