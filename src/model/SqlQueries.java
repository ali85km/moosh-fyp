package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlQueries {

	public SqlQueries() {
		// TODO Auto-generated constructor stub
	}

	public void sqlConnection() {

		String url = "jdbc:mysql://localhost:3306/sunrise";
		String username = "test";
		String password = "test";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {

		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException ignore) {

				}
		}

	}
	
	public void createUser(){

		INSERT INTO User (email, password, name, date_inscription) VALUES (null, MD5 (null), null, NOW ());

	}
	

}
