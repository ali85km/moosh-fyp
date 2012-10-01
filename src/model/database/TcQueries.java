package model.database;

import java.sql.SQLException;
import java.sql.Statement;

import model.forms.tc.FormTcAnnouncement;
import model.forms.tc.FormTcCommitment;
import model.forms.tc.FormTcContact;
import model.forms.tc.FormTcContact.Contact;
import model.forms.tc.FormTcEquipment;
import model.forms.tc.FormTcMeeting;
import model.forms.tc.FormTcMeeting.Meeting;
import model.forms.tc.FormTcTask;
import model.forms.tc.FormTcWorkHours;
import model.forms.tc.FormTcWorkHours.WeekWorkHours;
import model.forms.tc.FormTcWorkLife;

public class TcQueries {

    public static void insertFormTcCommitment(FormTcCommitment form)
            throws SQLException {
        Statement statement = DBQueries.connexion.createStatement();
        statement.executeUpdate("INSERT INTO FormTcCommitment ("
                + "formtccommitment_question1, "
                + "formtccommitment_question2, "
                + "formtccommitment_question3, "
                + "formtccommitment_question4, "
                + "formtccommitment_question5, "
                + "formtccommitment_question6, " + "formtccommitment_question7"
                + ") VALUES ('" + form.getQuestion1().getChoice() + "', '"
                + form.getQuestion2().getChoice() + "', '"
                + form.getQuestion3().getChoice() + "', '"
                + form.getQuestion4().getChoice() + "', '"
                + form.getQuestion5().getChoice() + "', '"
                + form.getQuestion6().getChoice() + "', '"
                + form.getQuestion7().getChoice() + "');");
    }

    public static void insertFormTcAnnouncement(FormTcAnnouncement form)
            throws SQLException {
        Statement statement = DBQueries.connexion.createStatement();
        statement.executeUpdate("INSERT INTO FormTcAnnouncement ("
                + "formtcannouncement_question1a, "
                + "formtcannouncement_question2a, "
                + "formtcannouncement_question1b, "
                + "formtcannouncement_question2b, "
                + "formtcannouncement_question3b, "
                + "formtcannouncement_question4b, "
                + "formtcannouncement_question5b" + ") VALUES ('"
                + form.getQuestion1a().getChoice() + "', '"
                + form.getQuestion2a().getChoice() + "', '"
                + form.getQuestion1b().getChoice() + "', '"
                + form.getQuestion2b().getChoice() + "', '"
                + form.getQuestion3b().getChoice() + "', '"
                + form.getQuestion4b().getChoice() + "', '"
                + form.getQuestion5b().getChoice() + "');");
    }

    public static void insertFormTcContact(FormTcContact form)
            throws SQLException {
        Statement statement = DBQueries.connexion.createStatement();
        Contact contact1 = form.getContactWeek1();
        statement.executeUpdate("INSERT INTO FormTcContact ("
                + "formtccontact_serie, " + "formtccontact_week, "
                + "formtccontact_emailreceive, " + "formtccontact_emailreply, "
                + "formtccontact_phonereceive, " + "formtccontact_phonereply, "
                + "formtccontact_smsreceive, " + "formtccontact_smsreply"
                + ") VALUES (1, 1" + ", '" + contact1.getEmailReceive()
                + "', '" + contact1.getEmailReplay() + "', '"
                + contact1.getPhoneReceive() + "', '"
                + contact1.getPhoneReplay() + "', '" + contact1.getSmsReceive()
                + "', '" + contact1.getSmsReplay() + "');");

        Contact contact2 = form.getContactWeek2();
        statement.executeUpdate("INSERT INTO FormTcContact ("
                + "formtccontact_serie, " + "formtccontact_week, "
                + "formtccontact_emailreceive, " + "formtccontact_emailreply, "
                + "formtccontact_phonereceive, " + "formtccontact_phonereply, "
                + "formtccontact_smsreceive, " + "formtccontact_smsreply"
                + ") VALUES (1, 1" + ", '" + contact2.getEmailReceive()
                + "', '" + contact2.getEmailReplay() + "', '"
                + contact2.getPhoneReceive() + "', '"
                + contact2.getPhoneReplay() + "', '" + contact2.getSmsReceive()
                + "', '" + contact2.getSmsReplay() + "');");

        Contact contact3 = form.getContactWeek3();
        statement.executeUpdate("INSERT INTO FormTcContact ("
                + "formtccontact_serie, " + "formtccontact_week, "
                + "formtccontact_emailreceive, " + "formtccontact_emailreply, "
                + "formtccontact_phonereceive, " + "formtccontact_phonereply, "
                + "formtccontact_smsreceive, " + "formtccontact_smsreply"
                + ") VALUES (1, 1" + ", '" + contact3.getEmailReceive()
                + "', '" + contact3.getEmailReplay() + "', '"
                + contact3.getPhoneReceive() + "', '"
                + contact3.getPhoneReplay() + "', '" + contact3.getSmsReceive()
                + "', '" + contact3.getSmsReplay() + "');");

        Contact contact4 = form.getContactWeek4();
        statement.executeUpdate("INSERT INTO FormTcContact ("
                + "formtccontact_serie, " + "formtccontact_week, "
                + "formtccontact_emailreceive, " + "formtccontact_emailreply, "
                + "formtccontact_phonereceive, " + "formtccontact_phonereply, "
                + "formtccontact_smsreceive, " + "formtccontact_smsreply"
                + ") VALUES (1, 1" + ", '" + contact4.getEmailReceive()
                + "', '" + contact4.getEmailReplay() + "', '"
                + contact4.getPhoneReceive() + "', '"
                + contact4.getPhoneReplay() + "', '" + contact4.getSmsReceive()
                + "', '" + contact4.getSmsReplay() + "');");
    }

    public static void insertFormTcEquipment(FormTcEquipment form)
            throws SQLException {
        Statement statement = DBQueries.connexion.createStatement();
        statement.executeUpdate("INSERT INTO FormTcEquipment ("
                + "formtcequipment_phoneline, "
                + "formtcequipment_answermachine, "
                + "formtcequipment_bookcase, "
                + "formtcequipment_callingcard, "
                + "formtcequipment_computer, " + "formtcequipment_desk, "
                + "formtcequipment_facsimile" + "formtcequipment_filecabinet, "
                + "formtcequipment_modem, " + "formtcequipment_pager, "
                + "formtcequipment_printer, " + "formtcequipment_software, "
                + "formtcequipment_typewriter, " + "formtcequipment_voicemail"
                + "formtcequipment_internetaccess" + ") VALUES ('"
                + form.isPhoneline()
                + "', '"
                + form.isAnswermachine()
                + "', '"
                + form.isBookcase()
                + "', '"
                + form.isCallingcard()
                + "', '"
                + form.isDesk()
                + "', '"
                + form.isFacsimile()
                + "', '"
                + form.isFilecabinet()
                + "', '"
                + form.isModem()
                + "', '"
                + form.isPager()
                + "', '"
                + form.isPrinter()
                + "', '"
                + form.isSoftware()
                + "', '"
                + form.isTypewriter()
                + "', '"
                + form.isVoicemail() + "', '" + form.isInternet() + "');");
    }

    public static void insertFormTcMeeting(FormTcMeeting form)
            throws SQLException {
        Statement statement = DBQueries.connexion.createStatement();
        Meeting meeting1 = form.getMeetingWeek1();
        statement.executeUpdate("INSERT INTO FormTcMeeting ("
                + "formtcmeeting_serie, " + "formtcmeeting_week, "
                + "formtcmeeting_audiototal, " + "formtcmeeting_audioattend, "
                + "formtcmeeting_videototal, " + "formtcmeeting_videoattend, "
                + "formtcmeeting_facetofaceconduct, "
                + "formtcmeeting_facetofaceattend" + ") VALUES (1, 1" + ", '"
                + meeting1.getAudioTotal() + "', '" + meeting1.getAudioAttend()
                + "', '" + meeting1.getVideoTotal() + "', '"
                + meeting1.getVideoAttend() + "', '"
                + meeting1.getFacetofaceConduct() + "', '"
                + meeting1.getFacetofaceAttend() + "');");

        Meeting meeting2 = form.getMeetingWeek2();
        statement.executeUpdate("INSERT INTO FormTcMeeting ("
                + "formtcmeeting_serie, " + "formtcmeeting_week, "
                + "formtcmeeting_audiototal, " + "formtcmeeting_audioattend, "
                + "formtcmeeting_videototal, " + "formtcmeeting_videoattend, "
                + "formtcmeeting_facetofaceconduct, "
                + "formtcmeeting_facetofaceattend" + ") VALUES (1, 1" + ", '"
                + ") VALUES (1, 1" + ", '" + meeting2.getAudioTotal() + "', '"
                + meeting2.getAudioAttend() + "', '" + meeting2.getVideoTotal()
                + "', '" + meeting2.getVideoAttend() + "', '"
                + meeting2.getFacetofaceConduct() + "', '"
                + meeting2.getFacetofaceAttend() + "');");

        Meeting meeting3 = form.getMeetingWeek3();
        statement.executeUpdate("INSERT INTO FormTcMeeting ("
                + "formtcmeeting_serie, " + "formtcmeeting_week, "
                + "formtcmeeting_audiototal, " + "formtcmeeting_audioattend, "
                + "formtcmeeting_videototal, " + "formtcmeeting_videoattend, "
                + "formtcmeeting_facetofaceconduct, "
                + "formtcmeeting_facetofaceattend" + ") VALUES (1, 1" + ", '"
                + ") VALUES (1, 1" + ", '" + meeting3.getAudioTotal() + "', '"
                + meeting3.getAudioAttend() + "', '" + meeting3.getVideoTotal()
                + "', '" + meeting3.getVideoAttend() + "', '"
                + meeting3.getFacetofaceConduct() + "', '"
                + meeting3.getFacetofaceAttend() + "');");

        Meeting meeting4 = form.getMeetingWeek4();
        statement.executeUpdate("INSERT INTO FormTcMeeting ("
                + "formtcmeeting_serie, " + "formtcmeeting_week, "
                + "formtcmeeting_audiototal, " + "formtcmeeting_audioattend, "
                + "formtcmeeting_videototal, " + "formtcmeeting_videoattend, "
                + "formtcmeeting_facetofaceconduct, "
                + "formtcmeeting_facetofaceattend" + ") VALUES (1, 1" + ", '"
                + ") VALUES (1, 1" + ", '" + meeting4.getAudioTotal() + "', '"
                + meeting4.getAudioAttend() + "', '" + meeting4.getVideoTotal()
                + "', '" + meeting4.getVideoAttend() + "', '"
                + meeting4.getFacetofaceConduct() + "', '"
                + meeting4.getFacetofaceAttend() + "');");
    }

    public static void insertFormTcTask(FormTcTask form) throws SQLException {
        Statement statement = DBQueries.connexion.createStatement();
        statement.executeUpdate("INSERT INTO FormTcTask ("
                + "formtctask_tasktitle, " + "formtctask_assigndate, "
                + "formtctask_duedate, " + "formtctask_enddate, "
                + "formtctask_telecommuter_id_fk, "
                + "formtctask_manager_id_fk, " + ") VALUES ('"
                + form.getTitle() + "', '" + form.getAssignDate() + "', '"
                + form.getDueDate() + "', '" + form.getEndDate() + "', '"
                // FIXME : getTelecommuterID FK and Manager ID FK +
                + "');");
    }

    public static void insertFormTcWorkHours(FormTcWorkHours form)
            throws SQLException {
        // FIXME : the number of the serie ? How to put it ?
        Statement statement = DBQueries.connexion.createStatement();
        WeekWorkHours weekWorkHours1 = form.getWorkHoursWeek1();
        statement.executeUpdate("INSERT INTO FormTcWorkHours ("
                + "formtcweekworkhours_serie, " + "formtcweekworkhours_week, "
                + "formtcweekworkhours_mondayhours, "
                + "formtcweekworkhours_tuesdayhours, "
                + "formtcweekworkhours_wednesdayhours, "
                + "formtcweekworkhours_thursdayhours, "
                + "formtcweekworkhours_fridayhours, "
                + "formtcweekworkhours_saturdayhours" + ") VALUES (1, 1"
                + ", '" + weekWorkHours1.getMondayHour() + "', '"
                + weekWorkHours1.getTuesdayHour() + "', '"
                + weekWorkHours1.getWednesdayHour() + "', '"
                + weekWorkHours1.getThursdayHour() + "', '"
                + weekWorkHours1.getFridayHour() + "', '"
                + weekWorkHours1.getSaturdayHour() + "');");

        WeekWorkHours weekWorkHours2 = form.getWorkHoursWeek2();
        statement.executeUpdate("INSERT INTO FormTcWorkHours ("
                + "formtcweekworkhours_serie, " + "formtcweekworkhours_week, "
                + "formtcweekworkhours_mondayhours, "
                + "formtcweekworkhours_tuesdayhours, "
                + "formtcweekworkhours_wednesdayhours, "
                + "formtcweekworkhours_thursdayhours, "
                + "formtcweekworkhours_fridayhours, "
                + "formtcweekworkhours_saturdayhours" + ") VALUES (1, 2"
                + ", '" + ") VALUES (1, 1" + ", '"
                + weekWorkHours2.getMondayHour() + "', '"
                + weekWorkHours2.getTuesdayHour() + "', '"
                + weekWorkHours2.getWednesdayHour() + "', '"
                + weekWorkHours2.getThursdayHour() + "', '"
                + weekWorkHours2.getFridayHour() + "', '"
                + weekWorkHours2.getSaturdayHour() + "');");

        WeekWorkHours weekWorkHours3 = form.getWorkHoursWeek3();
        statement.executeUpdate("INSERT INTO FormTcWorkHours ("
                + "formtcweekworkhours_serie, " + "formtcweekworkhours_week, "
                + "formtcweekworkhours_mondayhours, "
                + "formtcweekworkhours_tuesdayhours, "
                + "formtcweekworkhours_wednesdayhours, "
                + "formtcweekworkhours_thursdayhours, "
                + "formtcweekworkhours_fridayhours, "
                + "formtcweekworkhours_saturdayhours" + ") VALUES (1, 3"
                + ", '" + ") VALUES (1, 1" + ", '"
                + weekWorkHours3.getMondayHour() + "', '"
                + weekWorkHours3.getTuesdayHour() + "', '"
                + weekWorkHours3.getWednesdayHour() + "', '"
                + weekWorkHours3.getThursdayHour() + "', '"
                + weekWorkHours3.getFridayHour() + "', '"
                + weekWorkHours3.getSaturdayHour() + "');");

        WeekWorkHours weekWorkHours4 = form.getWorkHoursWeek4();
        statement.executeUpdate("INSERT INTO FormTcWorkHours ("
                + "formtcweekworkhours_serie, " + "formtcweekworkhours_week, "
                + "formtcweekworkhours_mondayhours, "
                + "formtcweekworkhours_tuesdayhours, "
                + "formtcweekworkhours_wednesdayhours, "
                + "formtcweekworkhours_thursdayhours, "
                + "formtcweekworkhours_fridayhours, "
                + "formtcweekworkhours_saturdayhours" + ", '"
                + ") VALUES (1, 4" + ", '" + weekWorkHours4.getMondayHour()
                + "', '" + weekWorkHours4.getTuesdayHour() + "', '"
                + weekWorkHours4.getWednesdayHour() + "', '"
                + weekWorkHours4.getThursdayHour() + "', '"
                + weekWorkHours4.getFridayHour() + "', '"
                + weekWorkHours4.getSaturdayHour() + "');");
    }

    public static void insertFormTcWorkLife(FormTcWorkLife form)
            throws SQLException {
        Statement statement = DBQueries.connexion.createStatement();
        statement.executeUpdate("INSERT INTO FormTcWorkLife ("
                + "formtcworklife_question1, " + "formtcworklife_question2, "
                + "formtcworklife_question3, " + "formtcworklife_question4, "
                + ") VALUES ('" + form.getQuestion1().getChoice() + "', '"
                + form.getQuestion2().getChoice() + "', '"
                + form.getQuestion3().getChoice() + "', '"
                + form.getQuestion4().getChoice() + "');");
    }

    public static void selectFormTcWorkLife() {

    }

}
