package tn.edu.esprit.cs.playBox.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnectionMysql {

	private static Connection connection;
	private static Statement statement;
	private static String url = "jdbc:mysql://localhost:3306/playboxdb";
	private static String user = "root";
	private static String password = "";

	public static Connection giveMeConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static Statement giveMeStatement() {
		try {
			statement = giveMeConnection().createStatement();
			System.out.println("statement configured ...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}
}
