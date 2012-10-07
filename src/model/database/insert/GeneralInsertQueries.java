package model.database.insert;

import java.sql.SQLException;
import java.sql.Statement;

import model.User;
import model.database.DBConnection;
import model.forms.TotalForm;

public class GeneralInsertQueries {

    public static void insertUser(User user) throws SQLException {
        Statement statement = DBConnection.connection.createStatement();
        // TODO : try maybe to insert some security MD5 in the VALUES part of
        // the update.
        // FIXME : check if there is not another user with the same username.
        int statut = statement.executeUpdate("INSERT INTO User ("
                + "user_fname, " + "user_lname, " + "user_uname, "
                + "user_password, " + "user_gender, " + "user_dob, "
                + "user_citizenship, " + "user_passport, "
                + "user_phone_number, " + "user_cell_number, " + "user_email, "
                + "user_address" + ") VALUES ('"
                + user.getFirstname()
                + "', '"
                + user.getLastname()
                + "', '"
                + user.getUsername()
                + "', '"
                + user.getPassword()
                + "', '"
                + user.getGender()
                + "', '"
                + user.getBirthday()
                + "', '"
                + user.getCitizenship()
                + "', '"
                + user.getPassport()
                + "', '"
                + user.getHomePhone()
                + "', '"
                + user.getCellPhone()
                + "', '"
                + user.getEmail() + "', '" + user.getAddress() + "0" + "');");

        System.out.println(statut);
    }

    public static void insertTotalForm(TotalForm form) {
        // TODO
    }
}
