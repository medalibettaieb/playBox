package tn.edu.esprit.cs.playBox.tests;

import tn.edu.esprit.cs.playBox.dao.UserDao;
import tn.edu.esprit.cs.playBox.domain.User;

public class TestAddUser {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();

		User user = new User();
		user.setName("foulen");

		userDao.addUser(user);

	}

}
