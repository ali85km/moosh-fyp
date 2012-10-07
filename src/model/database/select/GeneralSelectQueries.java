package model.database.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.User;
import model.database.DBConnection;

public class GeneralSelectQueries {

    public static User selectUser(String userName, String userPassword)
            throws SQLException {
        // TODO : Put some MD5 encryption here.
        // TODO : Check the input in the SQL queries.
        Statement statement = DBConnection.connection.createStatement();

        System.out
                .println("SELECT * from User WHERE LOWER(User.user_uname) = LOWER('"
                        + userName
                        + "') AND User.user_password = '"
                        + userPassword + "'");

        ResultSet rs = statement
                .executeQuery("SELECT * from User WHERE LOWER(User.user_uname) = LOWER('"
                        + userName
                        + "') AND User.user_password = '"
                        + userPassword + "'");
        rs.next();

        // TODO : How to access the 13th attribute ?
        User user = new User(rs.getString(2), rs.getString(3), rs.getString(4),
                "No way you get access to the password", rs.getString(6),
                rs.getString(7), rs.getString(8), rs.getString(9),
                rs.getString(10), rs.getString(11), rs.getString(12),
                rs.getString(13));

        return user;
    }
}
