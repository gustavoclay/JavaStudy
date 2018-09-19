package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.err.println("Unable to load MySQL Driver");
		}
	}

	public Connection getConnection() {

		try {

			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fj21", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
