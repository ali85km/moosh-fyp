package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.database.insert.GeneralInsertQueries;

public class DBConnection {

    public static Connection connection;

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
            DBConnection.connection = DriverManager.getConnection(url,
                    utilisateur, motDePasse);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
