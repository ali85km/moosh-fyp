package model.forms.tc;

public class FormTcContact {

    private Contact contactWeek1;
    private Contact contactWeek2;
    private Contact contactWeek3;
    private Contact contactWeek4;

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
