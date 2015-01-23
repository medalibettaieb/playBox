package tn.edu.esprit.cs.playBox.dao;

import java.sql.Statement;

import tn.edu.esprit.cs.playBox.domain.User;
import tn.edu.esprit.cs.playBox.util.MyConnectionMysql;

public class UserDao {
	private static Statement statement = MyConnectionMysql.giveMeStatement();

	public static boolean addUser(User user) {
		boolean b = false;

		try {
			String sql = "insert into user (name) values ('" + user.getName()
					+ "')";
			System.out.println(sql);
			statement.executeUpdate(sql);
			System.out.println("user added ...");
			b = true;

		} catch (Exception e) {
			System.err.println("problem in insertion ...");
		}
		return b;
	}

}
