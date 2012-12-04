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
            //connectDB();
        } catch (ClassNotFoundException e) {
            /* Gérer les éventuelles erreurs ici. */
        }
    }

    
    public static Connection connectDB() {
        // TODO : remember to close the database sometimes.
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "test2";
        String password = "1234";
        try {  
            return DriverManager.getConnection(url,
                    username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
