package tn.edu.esprit.cs.playBox.tests;

import java.util.List;

import tn.edu.esprit.cs.playBox.dao.UserDao;
import tn.edu.esprit.cs.playBox.domain.User;

public class TestFindAllUsers {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();

		List<User> users = userDao.findAllUsers();
		for (User user : users) {
			System.out.println(user.getName());
		}
	}

}
