package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBQueries {

    private static Connection connexion;

    static {
        /* Chargement du driver JDBC pour MySQL */
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            /* Gérer les éventuelles erreurs ici. */
        }
    }

    public static void connectDB() {
        // TODO : remember to close the database sometimes.
        String url = "jdbc:mysql://localhost:3306/test";
        String utilisateur = "test";
        String motDePasse = "test";
        try {
            DBQueries.connexion = DriverManager.getConnection(url, utilisateur,
                    motDePasse);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertUser(User user) throws SQLException {
        Statement statement = connexion.createStatement();
        // TODO : try maybe to insert some security MD5 in the VALUES part of
        // the update.
        int statut = statement
                .executeUpdate("INSERT INTO User (user_fname, user_lname, user_uname, user_password, user_gender, user_dob, user_citizenship, user_passport, user_phone_number, user_cell_number, user_email, user_address) VALUES ('"
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
                        + user.getEmail()
                        + "', '" + user.getAddress() + "0" + "');");

        System.out.println(statut);
    }

    public static void insertFormMgrCommAssess(FormMgrCommAssess form)
            throws SQLException {
        Statement statement = connexion.createStatement();
        // TODO : try maybe to insert some security MD5 in the VALUES part of
        // the update.
        int statut = statement
                .executeUpdate("INSERT INTO FormMgrWorkAssess ("
                        + "formmgrworkassess_, user_lname, user_uname, user_password,"
                        + "user_gender, user_dob, user_citizenship, user_passport, "
                        + "user_phone_number, user_cell_number, user_email, user_address"
                        + ") VALUES ('"
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
                        + user.getEmail()
                        + "', '" + user.getAddress() + "0" + "');");

        System.out.println(statut);
    }

    public static void insertTotalForm(User user) throws SQLException {
        Statement statement = connexion.createStatement();
        // TODO : try maybe to insert some security MD5 in the VALUES part of
        // the update.
        int statut = statement
                .executeUpdate("INSERT INTO User (user_fname, user_lname, user_uname, user_password, user_gender, user_dob, user_citizenship, user_passport, user_phone_number, user_cell_number, user_email, user_address) VALUES ('"
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
                        + user.getEmail()
                        + "', '" + user.getAddress() + "0" + "');");

        System.out.println(statut);
    }
}
